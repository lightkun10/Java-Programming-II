package Exercises.E1_Regular_expressions;

public class Checker {

    // Use regular expressions to create the method public
    // boolean isDayOfWeek(String string), which returns
    // true if the parameter string is an abbreviation of
    // a day of the week (mon, tue, wed, thu, fri, sat, sun)
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    // uses a regular expression to check whether all
    // the characters in the parameter string are vowels.
    // the letters that are considered vowels here are: a, e, i, o, and u.
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }

    // Use a regular expression to check whether the
    // parameter string expresses a time of day in the
    // form hh:mm:ss (hours, minutes, and seconds each
    // always take up two spaces).
    public boolean timeOfDay(String string) {
        // Regex model solution
        // String regex = "([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]";

        // Regex solution by Pandu
        String regexP = "([0-1][0-9]|[2][0-3]):([0-5][0-9]):([0-5][0-9])";

        return string.matches(regexP);
    }

}
