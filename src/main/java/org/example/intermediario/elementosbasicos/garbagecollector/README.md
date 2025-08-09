# Compile

javac org/example/intermediario/garbagecollector/*.java 

# Execute

java -Xmx128m -verbose:gc org.example.intermediario.elementosbasicos.garbagecollector.Main

### Vai retornar algo tipo 

```[0.002s][info][gc] Using G1
Memória usada: 4 MB
Contatos criados com sucesso!
[0,036s][info][gc] GC(0) Pause Full (System.gc()) 4M->1M(14M) 2,898ms
Contatos removidos com sucesso!
Memória usada: 2 MB```
