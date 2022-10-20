package org.matt;

import java.util.Random;
import java.util.stream.LongStream;

import org.roaringbitmap.longlong.Roaring64NavigableMap;

public class Main {
    public static void main(String[] args) {
        Roaring64NavigableMap r1 = Roaring64NavigableMap.bitmapOf();
        dumpStats(r1, "Empty");

        Roaring64NavigableMap r2 = Roaring64NavigableMap.bitmapOf(1, 10, 100, 1000, 10000, 100000, 1000000, 10000000);
        dumpStats(r2, "Powers of ten");

        dumpStats(createRandomBitMap(1, 100000), "Sparse 1% of 100K");
        dumpStats(createRandomBitMap(20, 100000), "Sparse 20% of 100K");
        dumpStats(createRandomBitMap(50, 100000), "Sparse 50% of 100K");
        dumpStats(createRandomBitMap(99, 100000), "Sparse 99% of 100K");

        dumpStats(createRandomBitMap(1, 10000000), "Sparse 1% of 10M");
        dumpStats(createRandomBitMap(20, 10000000), "Sparse 20% of 10M");
        dumpStats(createRandomBitMap(50, 10000000), "Sparse 50% of 10M");
        dumpStats(createRandomBitMap(99, 10000000), "Sparse 99% of 10M");

        dumpStats(createRandomBitMap(1, 1000000000), "Sparse 1% of 1G");
        dumpStats(createRandomBitMap(20, 1000000000), "Sparse 20% of 1G");
        dumpStats(createRandomBitMap(50, 1000000000), "Sparse 50% of 1G");
        dumpStats(createRandomBitMap(99, 1000000000), "Sparse 99% of 1G");
    }

    private static Roaring64NavigableMap createRandomBitMap(int fraction, int size) {
        Roaring64NavigableMap rr = Roaring64NavigableMap.bitmapOf();
        Random rng = new Random();
        LongStream.range(0, size)
                  .filter(__ -> rng.nextInt(100) < fraction)
                  .forEach(rr::add);
        return rr;
    }

    private static void dumpStats(Roaring64NavigableMap rr, String name) {
        System.out.println();
        System.out.println(name);
        System.out.println();
        System.out.println("    Cardinality : " + rr.getLongCardinality());
        System.out.println("    Memory size : " + rr.getLongSizeInBytes());
        System.out.println("    Disk size   : " + rr.serializedSizeInBytes());
        if (rr.getLongCardinality() != 0) {
            System.out.println("    Bits/value  : " + rr.getLongSizeInBytes() * 8 / rr.getLongCardinality());
        }
    }
}
