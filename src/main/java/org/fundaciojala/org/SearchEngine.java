package org.fundaciojala.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Search for a word in a sentence .
 *
 * @autor Bruno Vasquez
 */
public class SearchEngine {

    /**
     * Finds and fill a word in a sentence
     *
     * @param word string to search.
     * @param haystack string, the sentence to find the word
     * @return return true or false
     */
    static int find(String word, String haystack) {
        String regWord = "\\Q" + word.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcherWord = Pattern.compile(regWord).matcher(haystack);
        return matcherWord.find() ? matcherWord.start() : -1;
    }
}