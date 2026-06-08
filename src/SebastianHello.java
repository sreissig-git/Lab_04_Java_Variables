public class SebastianHello
{
    public static void main(String[] args)
{
int intOperandA = 1;
int intOperandB = 2;
int intSum = 3;
int intProduct = 4;
int intDifference = 5;
int intQuotient = 6;
int intModulo = 7;

double doubleOperandB = 4.50;
double doubleSum = 5.50;
double doubleProduct = 6.50;
double doubleDifference = 8.50;
double doubleQuotient = 9.50;
double doubleOperandA = 3.50;

int familyKids = 4;
boolean currentlyRaining = false;
double priceGallon = 3.84;
int favoriteNumber = 621; // 0621 is the MOS for Radio Operator in USMC which I was
double shoeSize = 10.5;
int birthMonth = 1;
String fullName = "Sebastian Andrew Reissig";

doubleSum = doubleOperandA + doubleOperandB;
doubleProduct = doubleOperandA * doubleOperandB;
doubleDifference = doubleOperandB - doubleOperandA;
doubleQuotient = doubleOperandB / doubleOperandA;

intSum = intOperandA + intOperandB;
intProduct = intOperandA * intOperandB;
intDifference = intOperandB - intOperandA;
intQuotient = intOperandB / intOperandA;
intModulo = intOperandB % intOperandA;

System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
System.out.println("The product using doubles of " + doubleOperandA + " and " +doubleOperandB + " is " + doubleProduct);
System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
System.out.println("The quotient using doubles of " + doubleOperandB + " and " +doubleOperandA + " is " + doubleQuotient);
System.out.println("");
System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
System.out.println("The quotient using ints of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
System.out.println("The modulo using ints of " + intOperandB + " and " + intOperandA + " is " + intModulo);

System.out.println(familyKids);
System.out.println(currentlyRaining);
System.out.println(priceGallon);
System.out.println(favoriteNumber);
System.out.println(shoeSize);
System.out.println(birthMonth);
System.out.println(fullName);



    }
}
