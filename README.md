# fishbase_taxon_cache
Compiles a single taxonomic archive using archived tables from https://github.com/jhpoelen/fishbase_archiver 

# prequisites 
java/scala/sbt

# usage
Either build the application using ```sbt assembly``` or download the pre-built jar from the [releases](../../releases) page. Then, run the application using something like ```java -jar [name of jar]```. 

The application prints a tab separated taxon cache into stdout and messages into stderr. You can find a pre-compiled taxon cache in the [releases](../../releases) section.

The messages look something like:
```
[https://github.com/jhpoelen/fishbase_archiver/releases/download/v0.1.0/stocks.tsv.gz] opening...
[https://github.com/jhpoelen/fishbase_archiver/releases/download/v0.1.0/stocks.tsv.gz] opened.
[https://github.com/jhpoelen/fishbase_archiver/releases/download/v0.1.0/taxa.tsv.gz] opening...
[https://github.com/jhpoelen/fishbase_archiver/releases/download/v0.1.0/taxa.tsv.gz] opened.
...
```

The taxon cache should look something like:
```
id  name  rank  commonNames path  pathIds pathNames externalUrl thumbnailUrl
SLB:45717 Porites iwayamaensis  Species   Anthozoa|Scleractinia|Poritidae||Porites|iwayamaensis ||SLB:1463|||SLB:45717  Class|Order|Family|SubFamily|Genus|Species  http://sealifebase.org/summary/45717  
SLB:93094 Eurysquilla leloeuffi Species   Malacostraca|Stomatopoda|Eurysquillidae||Eurysquilla|leloeuffi  ||SLB:619|||SLB:93094 Class|Order|Family|SubFamily|Genus|Species  http://sealifebase.org/summary/93094  
```
