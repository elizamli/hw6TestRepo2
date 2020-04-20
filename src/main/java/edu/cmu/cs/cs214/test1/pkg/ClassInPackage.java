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

    public enum TileSection {
        N{
            @Override
            public TileSection secAbove(){ return S; }
            @Override
            public TileSection secBelow(){ return C; }
            @Override
            public TileSection secLeft(){ return W; }
            @Override
            public TileSection secRight(){ return E; }
        },
        E{
            @Override
            public TileSection secAbove(){ return N; }
            @Override
            public TileSection secBelow(){ return S; }
            @Override
            public TileSection secLeft(){ return C; }
            @Override
            public TileSection secRight(){ return W; }
        },
        S{
            @Override
            public TileSection secAbove(){ return C; }
            @Override
            public TileSection secBelow(){ return N; }
            @Override
            public TileSection secLeft(){ return W; }
            @Override
            public TileSection secRight(){ return E; }
        },
        W{
            @Override
            public TileSection secAbove(){ return N; }
            @Override
            public TileSection secBelow(){ return S; }
            @Override
            public TileSection secLeft(){ return E; }
            @Override
            public TileSection secRight(){ return C; }
        },
        C{
            @Override
            public TileSection secAbove(){ return N; }
            @Override
            public TileSection secBelow(){ return S; }
            @Override
            public TileSection secLeft(){ return W; }
            @Override
            public TileSection secRight(){ return E; }
        },
        NE{
            @Override
            public TileSection secAbove(){ return S; }
            @Override
            public TileSection secBelow(){ return E; }
            @Override
            public TileSection secLeft(){ return N; }
            @Override
            public TileSection secRight(){ return NW; }
        },
        NW{
            @Override
            public TileSection secAbove(){ return S; }
            @Override
            public TileSection secBelow(){ return W; }
            @Override
            public TileSection secLeft(){ return NE; }
            @Override
            public TileSection secRight(){ return N; }
        },;

        /** copied from textbook Effective Java Item 34 */
        private static final Map<String, TileSection> STRING_TO_ENUM =
                Stream.of(values()).collect(toMap(Object::toString, e -> e));

        /**
         * Returns the TileSection enum value of a string.
         * @param symbol the string
         * @return enum of the string
         */
        public static TileSection fromString(String symbol) {
            return STRING_TO_ENUM.get(symbol);
        }

        //used in graph search
        public abstract TileSection secAbove();
        public abstract TileSection secBelow();
        public abstract TileSection secLeft();
        public abstract TileSection secRight();

        //hello hi
    }

}
