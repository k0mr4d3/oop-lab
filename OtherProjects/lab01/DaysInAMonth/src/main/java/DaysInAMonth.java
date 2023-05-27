import java.util.Scanner;
import java.util.Arrays;

public class DaysInAMonth
{
    static boolean isLeapYear(int year)
    {
        if (year % 4 != 0)
        {
            return false;
        }
        else
        {
            if (year % 100 == 0 && year % 400 != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);

        final String[] validMonths = {"January", "Jan", "Jan.", "1",
                                    "February", "Feb", "Feb.", "2",
                                    "March", "Mar", "Mar.", "3",
                                    "April", "Apr", "Apr.", "4",
                                    "May", "5",
                                    "June", "Jun", "6",
                                    "July", "Jul", "7",
                                    "August", "Aug", "Aug.", "8",
                                    "September", "Sep", "Sept.", "9",
                                    "October", "Oct", "Oct.", "10",
                                    "November", "Nov", "Nov.", "11",
                                    "December", "Dec", "Dec.", "12"
                                     };

        while (true)
        {
            System.out.println("enter month and year (separated by newline)");
            String strMonth = myInput.nextLine();
            String strYear = myInput.nextLine();

            int year;

            if (strYear.matches("\\d+"))
            {
                year = Integer.parseInt(strYear);

                if (Arrays.stream(validMonths).anyMatch(strMonth::equals))
                {
                    if (strMonth.equals("January") || strMonth.equals("Jan") || strMonth.equals("Jan.") || strMonth.equals("1"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("February") || strMonth.equals("Feb") || strMonth.equals("Feb.") || strMonth.equals("2"))
                    {
                        if (isLeapYear(year))
                            System.out.println(29);
                        else
                            System.out.println(28);
                    }
                    if (strMonth.equals("March") || strMonth.equals("Mar") || strMonth.equals("Mar.") || strMonth.equals("3"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("April") || strMonth.equals("Apr") || strMonth.equals("Apr.") || strMonth.equals("4"))
                    {
                        System.out.println(30);
                    }
                    if (strMonth.equals("May") || strMonth.equals("5"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("June") || strMonth.equals("Jun") || strMonth.equals("6"))
                    {
                        System.out.println(30);
                    }
                    if (strMonth.equals("July") || strMonth.equals("Jul") || strMonth.equals("7"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("August") || strMonth.equals("Aug") || strMonth.equals("Aug.") || strMonth.equals("8"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("September") || strMonth.equals("Sep") || strMonth.equals("Sept.") || strMonth.equals("9"))
                    {
                        System.out.println(30);
                    }
                    if (strMonth.equals("October") || strMonth.equals("Oct") || strMonth.equals("Oct.") || strMonth.equals("10"))
                    {
                        System.out.println(31);
                    }
                    if (strMonth.equals("November") || strMonth.equals("Nov") || strMonth.equals("Nov.") || strMonth.equals("11"))
                    {
                        System.out.println(30);
                    }
                    if (strMonth.equals("December") || strMonth.equals("Dec") || strMonth.equals("Dec.") || strMonth.equals("12"))
                    {
                        System.out.println(31);
                    }

                    break;
                }
                else
                {
                    System.out.println("invalid month. try again");
                }
            }
            else
            {
                System.out.println("invalid year. try again");
            }
        }
    }
}
