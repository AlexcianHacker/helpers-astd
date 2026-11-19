public class StrSSO_D { 
  private final char iStr[]; 
  private String aStr = null; // Replace With Some Other Type Later 
  public StrSSO_D(final char initStr[]) { 
    this.iStr = initStr; 
    // return this; 
  } 
  public short append(final char addchars[]) { 
    if (aStr != null) { 
      this.aStr += String.valueOf(addchars); 
      return 0; 
    } 
    aStr = String.valueOf(addchars); 
    return 0; 
  } 
  public String get() { 
    if (aStr == null) { 
      return String.valueOf(this.iStr); 
    } 
    return String.valueOf(this.iStr) + this.aStr; 
  } 
  @Override 
  public String toString() { 
    if (aStr == null) { 
      return String.valueOf(this.iStr); 
    } 
    return String.valueOf(this.iStr) + this.aStr; 
  } 
} 