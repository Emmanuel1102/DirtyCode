
package mailer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class DirtyMail extends JFrame {
    DirtyMail() {
        setSize(450, 500);
        setTitle("E-MAIL:");
        setVisible(true);
        setResizable(false);

        JPanel Autorizar = new JPanel();
        Autorizar.setLayout(null);
        Autorizar.setSize(450, 500);
        Autorizar.setBackground(Color.BLACK);

        JLabel anuncio = new JLabel("MANDAR E-MAIL:");
        anuncio.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(150, 0, 300, 70);
        Autorizar.add(anuncio);

        JLabel persona = new JLabel("DESTINATARIO:");
        persona.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        persona.setFont(fuenteEmpresa);
        persona.setBounds(0, 0, 300, 150);
        Autorizar.add(persona);

        final JTextField destinotxt = new JTextField();
        destinotxt.setForeground(Color.black);
        destinotxt.setBorder(null);
        destinotxt.setBounds(200, 63, 200, 30);
        Autorizar.add(destinotxt);

        JLabel Asunto = new JLabel("ASUNTO:");
        Asunto.setForeground(Color.white);
        Font Destino = new Font("Arial", Font.BOLD, 14);
        Asunto.setFont(Destino);
        Asunto.setBounds(0, 104, 400, 150);
        Autorizar.add(Asunto);

        JTextField asuntotxt = new JTextField("");
        asuntotxt.setForeground(Color.black);
        asuntotxt.setBorder(null);
        asuntotxt.setBounds(200, 170, 200, 30);
        Autorizar.add(asuntotxt);

        JTextArea Mensajetxt = new JTextArea();
        Mensajetxt.setSize(650, 130);
        Mensajetxt.setLineWrap(true);
        Mensajetxt.setForeground(Color.black);
        Mensajetxt.setBorder(null);
        Mensajetxt.setBounds(10, 240, 400, 130);
        Autorizar.add(Mensajetxt);

        JButton Enviar = new JButton("Enviar");
        Enviar.setBackground(Color.black);
        Enviar.setForeground(Color.white);
        Enviar.setBounds(140, 400, 200, 50);
        Autorizar.add(Enviar);
        
        JLabel background = new JLabel();
        background.add(Autorizar);
        add(background);
        setVisible(true);
        
            Enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String tuEmail = "ejemplo123@gmail.com";
        String contrasenatuEmail = "12345";
        String destinatario = destinotxt.getText();
        String asunto = asuntotxt.getText();
        String mensaje = Mensajetxt.getText();
        
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress (tuEmail));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(tuEmail,contrasenatuEmail);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null, "Correo enviado exitosamente");
        } catch (AddressException ex) {
        } catch (MessagingException ex) {
        }     
    } });
           
    }
    
    public static void main(String[]args){
    
    new DirtyMail();
    }
    
    
        }       

   

