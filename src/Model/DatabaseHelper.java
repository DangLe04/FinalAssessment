/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.crypto.spec.SecretKeySpec;
import javax.persistence.*;
import java.util.List;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author thainguyen
 */
public class DatabaseHelper {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static final String ALGORITHM = "AES";

    public DatabaseHelper() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Assignment4");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public Boolean login(String email, String password){
        try {
            User user = new User();

            TypedQuery<User> query = entityManager.createNamedQuery("User.findByEmail", User.class);
            query.setParameter("email", email);

            user = query.getSingleResult();

            String dePass = decryptPassword(user.getPassword());


            return Objects.equals(password, dePass);
        }catch (NoResultException exception){
            return false;
        }

    }

    public void register(User user){

        String encryptedPassword = encryptPassword(user.getPassword());
        user.setPassword(encryptedPassword);
        entityTransaction.begin();

        entityManager.persist(user);

        entityTransaction.commit();
    }

    public void addDocument(Document document){

        entityTransaction.begin();

        entityManager.persist(document);

        entityTransaction.commit();

    }

    public void addQuiz(Quiz quiz){

        entityTransaction.begin();

        entityManager.persist(quiz);

        entityTransaction.commit();
    }

    public void addQuestion(QuizQuestion quizQuestion){
        entityTransaction.begin();

        entityManager.persist(quizQuestion);

        entityTransaction.commit();
    }

    public void  addSurvey(Survey survey){
        entityTransaction.begin();

        entityManager.persist(survey);

        entityTransaction.commit();
    }

    public Document viewDocument(int id){
        Document document = new Document();

        entityTransaction.begin();

        TypedQuery<Document> query = entityManager.createNamedQuery("Document.findByDocumentId", Document.class);
        query.setParameter("documentId", id);

        document = query.getSingleResult();

        entityTransaction.commit();

        return document;
    }

    public Quiz viewQuiz(int id){
        entityTransaction.begin();

        TypedQuery<Quiz> query = entityManager.createNamedQuery("Quiz.findByQuizID", Quiz.class);
        query.setParameter("quizID", id);

        Quiz quiz = query.getSingleResult();

        entityTransaction.commit();

        return quiz;
    }

    public Survey viewSurvey(int id){
        entityTransaction.begin();

        TypedQuery<Survey> query = entityManager.createNamedQuery("Survey.findBySurveyId", Survey.class);
        query.setParameter("surveyId", id);

        Survey survey = query.getSingleResult();

        entityTransaction.commit();

        return survey;
    }

    public List<Document> getDocuments(){
        TypedQuery<Document> query = entityManager.createNamedQuery("Document.findAll",Document.class);

        return query.getResultList();
    }

    public List<Quiz> getQuizzes(){
        TypedQuery<Quiz> query = entityManager.createNamedQuery("Quiz.findAll",Quiz.class);

        return query.getResultList();
    }

    public List<Survey> getSurveys(){
        TypedQuery<Survey> query = entityManager.createNamedQuery("Survey.findAll",Survey.class);

        return query.getResultList();
    }

    public Boolean checkUser(String email){
        entityTransaction.begin();

        TypedQuery<Long> query =entityManager.createNamedQuery("User.countByEmail", Long.class);
        query.setParameter("email", email);

        entityTransaction.commit();

        return query.getSingleResult() == 0;

    }

    public void prepareSecreteKey() {
        final String myKey = "secrete";
        MessageDigest sha = null;
        try {
            key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private String encryptPassword(String password){
        try {
            prepareSecreteKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(password.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    private String decryptPassword(String password){
        try {
            prepareSecreteKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(password)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    public void submitQuiz(Customer customer){
        entityTransaction.begin();

        entityManager.merge(customer);

        entityTransaction.commit();
    }

}
