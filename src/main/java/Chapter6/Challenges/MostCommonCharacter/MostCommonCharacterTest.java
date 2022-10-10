package Chapter6.Challenges.MostCommonCharacter;

;
import org.junit.Assert;
import org.junit.Test;

public class MostCommonCharacterTest {

        MostCommonCharacter mcc = new MostCommonCharacter();

        @Test
        public void mostCommonCharacterTest1() {
            String str = "5003196532" + "8932857241" + "1886684186" + "2095882212" + "7736052319" + "0513214100" + "9837113941" + "5535441504" + "6350518702" + "5831217238";

            Assert.assertEquals('1', mcc.recurringChar(str));
        }

        @Test
        public void mostCommonCharacterTest2() {
            String str = "3585922463" + "4564881449" + "9744344742" + "8950706750" + "7316600461" + "9728760400" + "7599995873" + "0552858863" + "6107666584" + "8137602552";

            Assert.assertEquals('4', mcc.recurringChar(str));
        }

        @Test
        public void mostCommonCharacterTest3() {
            String str = "4846380793" + "4193747220n" + "9075367490" + "1180082954" + "2190728751" + "7748973893" + "1981988622n" + "5637648056" + "8515013697" + "4592237105";

            Assert.assertEquals('7', mcc.recurringChar(str));
        }

        @Test
        public void mostCommonCharacterTest4() {
            String str = "2276666678274" + "46085766663499" + "60053968666671" + "08912666667263" + "9188951666383" + "0463711695" + "8940121428" + "6030148532" + "1579113887" + "7221199733";

            Assert.assertEquals('6', mcc.recurringChar(str));
        }

        @Test
        public void mostCommonCharacterTest5() {
            String str = "5555003196532" + "8932855557241" + "18866841555586" + "20955588552212" + "7736052555319" + "0513214105550" + "983711355941" + "5535441504" + "6350518702" + "5831217238";

            Assert.assertEquals('5', mcc.recurringChar(str));
        }

        @Test
        public void mostCommonCharacterTest6() {
            String str = "nnpppppplldfdfmnnnnnnnnn";
            Assert.assertEquals('n', mcc.recurringChar(str));
        }

}
