# Test Roaring BitMap behavior

See https://github.com/lemire/RoaringBitmap/

Stats:

```
Empty

    Cardinality : 0
    Memory size : 16
    Disk size   : 5

Powers of ten

    Cardinality : 8
    Memory size : 132
    Disk size   : 65
    Bits/value  : 132

Sparse 1% of 100K

    Cardinality : 983
    Memory size : 2070
    Disk size   : 1999
    Bits/value  : 16

Sparse 20% of 100K

    Cardinality : 20222
    Memory size : 16480
    Disk size   : 16417
    Bits/value  : 6

Sparse 50% of 100K

    Cardinality : 50025
    Memory size : 16480
    Disk size   : 16417
    Bits/value  : 2

Sparse 99% of 100K

    Cardinality : 99066
    Memory size : 16480
    Disk size   : 16417
    Bits/value  : 1

Sparse 1% of 10M

    Cardinality : 99720
    Memory size : 200450
    Disk size   : 200681
    Bits/value  : 16

Sparse 20% of 10M

    Cardinality : 1999873
    Memory size : 1253774
    Disk size   : 1254617
    Bits/value  : 5

Sparse 50% of 10M

    Cardinality : 5001774
    Memory size : 1253774
    Disk size   : 1254617
    Bits/value  : 2

Sparse 99% of 10M

    Cardinality : 9900091
    Memory size : 1253774
    Disk size   : 1254617
    Bits/value  : 1

Sparse 1% of 1G

    Cardinality : 10001391
    Memory size : 20094428
    Disk size   : 20124871
    Bits/value  : 16

Sparse 20% of 1G

    Cardinality : 200022740
    Memory size : 125032338
    Disk size   : 125123817
    Bits/value  : 5

Sparse 50% of 1G

    Cardinality : 500023557
    Memory size : 125032338
    Disk size   : 125123817
    Bits/value  : 2

Sparse 99% of 1G

    Cardinality : 990001177
    Memory size : 125032338
    Disk size   : 125123817
    Bits/value  : 1

Process finished with exit code 0
```
