
/**
 * Created by andrey on 02.04.2016.
 */
public class Operator {
    protected static Phone[] regPhones = new Phone[1];
    private static int regCount;

    public boolean registration(Phone phone, String number){
        if (phone.isActivated()){
            return false;
        } else if (this.numberSearch(number, false)){
            System.out.println("Number '" + number + "' is already in use!");
            return false;
        } else {
            if (regCount == regPhones.length){
                Phone[] temparr = new Phone[regPhones.length * 2];
                System.arraycopy(regPhones, 0, temparr, 0, regPhones.length);
                regPhones = temparr;
            }
            phone.setNumber(number);
            regPhones[regCount]=phone;
            phone.setActivated();
            regCount++;
            return true;
            }
    }

    protected boolean numberSearch(String number, boolean isThisACall){
        Phone phone;
        for (int i = 0; i < regCount; i++){
            phone = regPhones[i];
            if (phone.getNumber().equalsIgnoreCase(number)){
                if (isThisACall){
                    phone.answer();
                    return true;
                } else {
                    return true;
                }

            }
        }
        return false;
    }
}
