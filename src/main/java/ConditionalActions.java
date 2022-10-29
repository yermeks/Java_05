public class ConditionalActions {
//    Given an integer M perform the following conditional actions:
//    If M is multiple of 7 and 9 then return "Good Number".
//    If M is only multiple of 9 and not of 7  then return "Bad Number"
//    If M is only multiple of 11 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    public String conditionalActions(int m) {
        if (m % 7 == 0 && m % 9 == 0) {
            return "Good Number";
        } else if (m % 9 == 0 && m % 7 != 0) {
            return "Bad Number";
        } else if (m % 11 == 0 && m % 9 != 0 && m % 7 != 0) {
            return "Poor Number";
        }
        return "-1";
    }
}
