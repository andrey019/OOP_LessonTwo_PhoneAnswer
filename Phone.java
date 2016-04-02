
/**
 * Created by andrey on 02.04.2016.
 */
public class Phone {
    private String number;
    private boolean activated;
    private Operator operator;

    public Phone(){
        operator = new Operator();
    }

    protected void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public boolean isActivated(){
        return activated;
    }

    protected void setActivated(){
        this.activated = true;
    }

    public void activation(Phone phone, String number){
        if (this.equals(phone)){
            if (this.operator.registration(phone, number)){
                System.out.println("Activation successful, your number is '" + this.getNumber() + "'");
            } else if (phone.isActivated()){
                System.out.println("Phone is already activated! Your number is '" + this.getNumber() + "'");
            }
        } else {
            System.out.println("You're cannot activate another phone from your phone!");
        }

    }

    public void call(String number){
        if (this.activated){
            System.out.println("[" + this.getNumber() + "] Calling number " + number + "...");
            if (!this.operator.numberSearch(number, true)){
                System.out.println("[" + this.getNumber() + "] Number you're calling '" + number
                                    + "' is not registered!");
            }
        } else {
            System.out.println("Your phone is not activated!");
        }
    }

    protected void answer(){
        System.out.println("[" + this.getNumber() + "] Hello?");
    }
}
