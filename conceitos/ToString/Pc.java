package conceitos.ToString;

public class Pc {
  String memory = "16GB Ram ddr5";
  String GPU = "RTX 4090";
  String mobo = "MSI MAG Z790 TOMAHAWK";
  String CPU = "Intel - Core i9-14900K 14th Gen 24-Core 32-Thread";
  String CRAC = "ASUS ROG STRIX LC II 360";
  String src = "CORSAIR - RMX Series RM1000x Cybenetics ";

  public String toString(){
    return "memory: " + memory + "\nGPU: " + GPU + "\nmobo" + mobo + "\nCPU:  " + CPU + "\nCRAC: " + CRAC + "\nsource: " + src;
  }
}

