// import java.net.PasswordAuthentication;
import java.util.Properties;
// import javax.activation.*;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



// import java.beans.Statement;

import java.sql.*;
public class Mail_sending {
    public static void sendMail(String recepient,String name) throws Exception{
        // System.out.println("Preparing to send mail");

        Properties proper = new Properties();
        proper.put("mail.smtp.auth","true");
        proper.put("mail.smtp.starttls.enable", "true");
        proper.put("mail.smtp.host", "smtp.gmail.com");
        proper.put("mail.smtp.port", "587");

        final String Myaccount = "managehotel91@gmail.com";
        final String password = "Qwertyuiop@123";
        
        Session session = Session.getInstance(proper,new Authenticator() {
            @Override
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Myaccount,password);
           }
        });

        Message message = prepareMessage(session,Myaccount,recepient,name);
        Transport.send(message);
        // System.out.println("Message sent Successfully");
    }

    private static Message prepareMessage(Session session,String Myaccount, String recepient,String name) {
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Myaccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            // int otp = (int) ((Math.random() * (100000 - 999999)) + 999999);
            // System.out.println(otp);
            message.setSubject("Welcome to Hotel ***** ");
            String htmltext = "<h3>Dear "+name+",</h3><br><p>Thank to Choosing hotel ***. You'r Registration is Done ! </p><br><h5>Thank to Team</h5><p></p>";
            message.setContent(htmltext,"text/html");
            return message;
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
    public static int SendOTP(String recepient, String Manager_customer) throws Exception{
        // System.out.println("Preparing to send OTP");

        Properties proper = new Properties();
        proper.put("mail.smtp.auth","true");
        proper.put("mail.smtp.starttls.enable", "true");
        proper.put("mail.smtp.host", "smtp.gmail.com");
        proper.put("mail.smtp.port", "587");

        final String Myaccount = "managehotel91@gmail.com";
        final String password = "Qwertyuiop@123";
        
        Session session = Session.getInstance(proper,new Authenticator() {
            @Override
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Myaccount,password);
           }
        });
        final int otp = OTPgenerated();
        Message message = prepareOtp(session,Myaccount,recepient,otp,Manager_customer);
        Transport.send(message);
        // System.out.println("OTP sent Successfully");
        return otp;

    }
    private static int OTPgenerated() {
        int otp = (int) ((Math.random() * (100000 - 999999)) + 999999);
        return otp;
    }
    private static Message prepareOtp(Session session,String Myaccount, String recepient,int otp ,String Manager_customer) {
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Myaccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            // System.out.println(otp);
            message.setSubject("Welcome Again to Hotel ***** ");
            String htmltext = "<h3>Dear "+Manager_customer+",</h3><br><p>Your One Time Password is : "+otp+"</p><br><p>if This Info is Not belong to you then send feedback to our mail <br><h5>Don't Share To Anywhere</h5><br> </p><h5>Thank to Team</h5><p></p>";
            message.setContent(htmltext,"text/html");
            return message;
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void SendPasswordReset(String recepient) throws Exception{
        // System.out.println("Preparing to send Reset message");

        Properties proper = new Properties();
        proper.put("mail.smtp.auth","true");
        proper.put("mail.smtp.starttls.enable", "true");
        proper.put("mail.smtp.host", "smtp.gmail.com");
        proper.put("mail.smtp.port", "587");

        final String Myaccount = "managehotel91@gmail.com";
        final String password = "Qwertyuiop@123";
        
        Session session = Session.getInstance(proper,new Authenticator() {
            @Override
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Myaccount,password);
           }
        });
        
        Message message = prepareResetMessage(session, Myaccount, recepient);
        Transport.send(message);
        // System.out.println("Reset mail sent Successfully");
    }
    private static Message prepareResetMessage(Session session,String Myaccount, String recepient) {
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Myaccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            Connection con = new dbConnection().getDbconnection();
            Statement stm = con.createStatement();
            String q = "select name from customer_details where email='"+recepient+"'";
            ResultSet r = stm.executeQuery(q);
            r.next();
            message.setSubject("Welcome Again to Hotel ***** ");
            String htmltext = "<h3>Dear "+r.getString("name")+",</h3><br><p>Your Password is Reset </p><br><p>if You Not Agree with that then info us from this mail <br><h5>our team is ready for that</h5><br> </p><h5>Thank to Team</h5><p></p>";
            con.close();
            message.setContent(htmltext,"text/html");
            return message;
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void SendReserverMail(String recepient) throws Exception{
        // System.out.println("Preparing to send Booking message");

        Properties proper = new Properties();
        proper.put("mail.smtp.auth","true");
        proper.put("mail.smtp.starttls.enable", "true");
        proper.put("mail.smtp.host", "smtp.gmail.com");
        proper.put("mail.smtp.port", "587");

        final String Myaccount = "managehotel91@gmail.com";
        final String password = "Qwertyuiop@123";
        
        Session session = Session.getInstance(proper,new Authenticator() {
            @Override
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(Myaccount,password);
           }
        });
        
        Message message = prepareBookingMes(session, Myaccount, recepient);
        Transport.send(message);
        // System.out.println("Booking mail sent Successfully");
    }
    private static Message prepareBookingMes(Session session,String Myaccount, String recepient) {
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Myaccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            Connection con = new dbConnection().getDbconnection();
            Statement stm = con.createStatement();
            String q = "select id,name from customer_details where email='"+recepient+"'";
            ResultSet r = stm.executeQuery(q);
            r.next();
            Statement stm1=con.createStatement();
            String q2 = "select room_no from room_info where customer_id="+r.getInt("id")+"";
            ResultSet rs = stm1.executeQuery(q2);
            String room_numbers="";
            while(rs.next()) {
                room_numbers+=Integer.toString(rs.getInt("room_no"));
                room_numbers+=' ';
            }
            message.setSubject("Hotel Reservation Is Done !... ");
            String htmltext = "<h3>Dear "+r.getString("name")+",<p>Your Room Booking is Done You'r Booking Room's is</p><br><h4>"+room_numbers+"</h4><br><h5> Have A Nice Day </h5><br> <h5>Thank to Team</h5>";
            con.close();
            message.setContent(htmltext,"text/html");
            return message;
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}

