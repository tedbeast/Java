package Chapter3._0_OOP.PassByReference;
/*
do not modify anything here - take a look at Recipient.
 */
public class Sender {
    public String sendMail(Mail m, Recipient r){
        r.recieveMail(m);
        if(m.opened){
            return "they got my mail :)";
        }else{
            return "they didn't open my mail :(";
        }
    }
}
