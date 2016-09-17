package org.fundaciojala.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Search for a word in a sentence .
 *
 * @autor Bruno Vasquez
 */
public class SearchEngine {

    public static final String REGEX = "_";
    public static final String REPLACEMENT = "\\\\E.\\\\Q";
    public static final String START_QUOTING = "\\Q";
    public static final String END_QUOTING = "\\E";

    /**
     * Finds and fills a word in a sentence
     *
     * @param word string to search.
     * @param haystack string, the sentence to find the word
     * @return return true or false
     */
    static int find(String word, String haystack) {
        String regWord = START_QUOTING.concat(word.replaceAll(REGEX, REPLACEMENT) ).concat(END_QUOTING);
        Matcher matcherWord = Pattern.compile(regWord).matcher(haystack);
        return matcherWord.find() ? matcherWord.start() : -1;
    }
}