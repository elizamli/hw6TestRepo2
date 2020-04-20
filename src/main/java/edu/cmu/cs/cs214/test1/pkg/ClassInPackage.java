package edu.cmu.cs.cs214.test1.pkg;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class ClassInPackage {
    int first = 0;

    //HI!
    public int getFirst(){
        return first;
    }

    enum SegmentType {
        MONASTERY,
        CITY,
        ROAD,
        FIELD;

        /** copied from textbook Effective Java Item 34 */
        private static final Map<String, SegmentType> STRING_TO_ENUM =
                Stream.of(values()).collect(toMap(Object::toString, e -> e));

        /**
         * Returns the SegmentType enum value of a string.
         * @param symbol the string
         * @return enum of the string
         */
        public static SegmentType fromString(String symbol){
            return STRING_TO_ENUM.get(symbol);
        }

    }

}
