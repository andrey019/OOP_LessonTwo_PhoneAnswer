/**
 * Created by andrey on 02.04.2016.
 */
public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.activation(phone1, "111");
        phone3.activation(phone3, "333");
        phone1.call("5468754");
        phone1.call("333");
        phone2.activation(phone2, "111");
        phone2.activation(phone2, "222");
        phone2.call("111");
        phone2.activation(phone2, "555");
        phone4.call("333");
        phone4.activation(phone2, "555");

    }
}

/*
Activation successful, your number is '111'
Activation successful, your number is '333'
[111] Calling number 5468754...
[111] Number you're calling '5468754' is not registered!
[111] Calling number 333...
[333] Hello?
Number '111' is already in use!
Activation successful, your number is '222'
[222] Calling number 111...
[111] Hello?
Phone is already activated! Your number is '222'
Your phone is not activated!
You're cannot activate another phone from your phone!

Process finished with exit code 0
 */