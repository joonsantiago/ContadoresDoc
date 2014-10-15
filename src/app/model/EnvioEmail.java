/*
 * To change contadores template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EnvioEmail extends ContadoresDoc {

    public void EnviarEmail() {
        
        //getAllvalores()
        
        String textoMSg = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                + "<style type=\"text/css\">\n"
                + "table {\n"
                + "	text-align: center;\n"
                + "	font-size: 12px;\n"
                + "	font-family: \"Palatino Linotype\", \"Book Antiqua\", Palatino, serif;\n"
                + "}\n"
                + ".assinatura {\n"
                + "	color: #900;\n"
                + "	font-weight: bold;\n"
                + "}\n"
                + ".ass2 {\n"
                + "	font-size: 12px;\n"
                + "	color: #666;\n"
                + "}\n"
                + "</style>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "\n"
                + "<p>Prezados,</p>\n"
                + "<p>Segue abaixo contadores de impress&atilde;o refente a esse m&ecirc;s.</p>\n"
                + "<p>&nbsp;</p>\n"
                + "<table width=\"913\" height=\"489\" border=\"0\" cellspacing=\"0\">\n"
                + "  <tr bgcolor=\"#FFFFFF\">\n"
                + "    <td width=\"82\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td width=\"159\" bgcolor=\"#EEEEEE\"></td>\n"
                + "    <td width=\"238\" bgcolor=\"#EEEEEE\"></td>\n"
                + "    <td width=\"26\">&nbsp;</td>\n"
                + "    <td width=\"159\" bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td width=\"237\" bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "  </tr>\n"
                + "  <tr bgcolor=\"#FFFFFF\">\n"
                + "    <td width=\"82\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td width=\"159\" bgcolor=\"#EEEEEE\">Model Name</td>\n"
                + "    <td width=\"238\" bgcolor=\"#EEEEEE\">"+getAllvalores()[0][0]
                +"</td>\n"
                + "    <td width=\"26\">&nbsp;</td>\n"
                + "    <td width=\"159\" bgcolor=\"#EEEEEE\">Model Name</td>\n"
                + "    <td width=\"237\" bgcolor=\"#EEEEEE\">"+getAllvalores()[2][0]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Serial Num</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][1]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Serial Num</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][4]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Firmware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][2]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Firmware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][5]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Sub Firware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][3]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Sub Firware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][6]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Memory Size</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][4]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Memory Size</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][7]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td colspan=\"2\" bgcolor=\"#EEEEEE\"> ****************************** Device Status    ******************************</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td colspan=\"2\" bgcolor=\"#EEEEEE\">****************************** Device Status    ******************************</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Page Counter</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][6]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Page Counter</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][8]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Drum Count</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[0][7]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Drum Count</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[2][9]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\"> </td>\n"
                + "    <td bgcolor=\"#EEEEEE\"></td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Model Name</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][0]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Model Name</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Kyocera Command Center</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Serial Num</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][4]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Total</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][0]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Firmware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][5]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">A4</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][9]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Sub Firware Version</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][6]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">B5</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][1]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Memory Size</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][7]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">A5</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][2]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td colspan=\"2\" bgcolor=\"#EEEEEE\">****************************** Device Status    ******************************</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">F&oacute;lio</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][3]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Page Counter</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][8]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Legal EUA</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][4]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Drum Count</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[3][9]
                +"</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Letter</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][5]
                +"</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Statement</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][6]
                +"</td>\n"
                + "  </tr><tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Outra (Duplo)</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][7]
                +"</td>\n"
                + "  </tr><tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">Outra (&Uacute;nico)</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">"+getAllvalores()[1][8]
                +"</td>\n"
                + "  </tr><tr>\n"
                + "    <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td>&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "    <td bgcolor=\"#EEEEEE\">&nbsp;</td>\n"
                + "  </tr>\n"
                + "</table>\n"
                + "<p>&nbsp;</p>\n"
                + "<p><span class=\"assinatura\">Atenciosamente<br />\n"
                + "Jonatas C. Santiago<br />\n"
                + "</span><br />\n"
                + "<span class=\"ass2\">Telefone: (61) 3105-4469 | Fax: (61) 3105-4452 <br />\n"
                + "  Skype: cpa3.documentall<br />\n"
                + "  Centro de Processamento de Arquivos – CPA</span><br />\n"
                + "  <a href=\"http://www.documentall.com.br/\">www.documentall.com.br</a> / <u><a href=\"mailto:remessa@documentall.com.br\">remessa@documentall.com.br</a></u> <br />\n"
                + "  DOCUMENTALL - Gest&atilde;o e Log&iacute;stica de Documentos<br />\n"
                + "  Crs 504 - Bloco B - Entrada 53 - Sobreloja - Asa Sul<br />\n"
                + "Bras&iacute;lia - DF - Cep 70.331-525</p>\n"
                + "<p>&nbsp; </p>\n"
                + "</body>\n"
                + "</html>";

        Properties props = new Properties();
        /**
         * Parâmetros de conexão com servidor Gmail props.put("mail.smtp.host",
         * "smtp.gmail.com"); props.put("mail.smtp.socketFactory.port", "465");
         * props.put("mail.smtp.socketFactory.class",
         * "javax.net.ssl.SSLSocketFactory"); props.put("mail.smtp.auth",
         * "true"); props.put("mail.smtp.port", "995"); Session session =
         * Session.getDefaultInstance(props, new javax.mail.Authenticator() {
         * protected PasswordAuthentication getPasswordAuthentication() { return
         * new PasswordAuthentication("santjonatas@gmail.com",
         * "feradobailejon"); }
        });
         */
        props.put("mail.smtp.host", "mail.documentall.com.br");  //mail.documentall.com.br //msstd:mail.documentall.com.br
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "false");

        //props.put("mail.smtp.socketFactory.port", "465");
        //props.setProperty("mail.user", "myuser");
        //props.setProperty("mail.password", "mypwd");
        //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.port", "995");

        Session session = Session.getDefaultInstance(props, null);

        /**
         * Ativa Debug para sessão
         */
        //session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jonatas@documentall.com.br")); //Remetente

            Address[] toUser = InternetAddress //Destinat�rio(s)
            		.parse("jonatas@documentall.com.br");
            		//.PARSE("jonatas@documentall.com.br, remessa@documentall.com.br, asstecnica@infotech-df.com.br, marketing@infotech-df.com.br");

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Contadores de Impress�o");//Assunto
            message.setContent(textoMSg, "text/html");

            Transport.send(message);

            //System.out.println("Feito!!!");
            JOptionPane.showMessageDialog(null, "Email enviado com sucesso!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        
        for(int i=0; i<4;i++){
        	for(int j=0;j<9;j++){
        		if(j==0){
        			if(i==1){
        				new DadosArquivo().GravarArquivo("000715092014",false);
        				new DadosArquivo().GravarArquivo("Kyocera Command Center",false);
        				new DadosArquivo().GravarArquivo(getAllvalores()[i][j],false);
        			}else{
        				new DadosArquivo().GravarArquivo("000715092014",false);
        			}
        		}else{
        			new DadosArquivo().GravarArquivo(getAllvalores()[i][j],false);
        		}
        	}
        	new DadosArquivo().GravarArquivo(getAllvalores()[i][9],true);
        }
    }
}
