class StrSSO_D { 
  private char iStr[]; 
  private String aStr = null; // Replace With Some Other Type Later 
  public StrSSO_D(char initStr[]) { 
    this.iStr = initStr; 
    return this; 
  } 
  public short append(char addchars[]) { 
    if (aStr != null) { 
      this.aStr += addchars; 
      return 0; 
    } 
    aStr = 
  } 
  public String get() { 
    return this.iStr[] + this.aStr; 
  } 
  @Override 
  public String toString() { 
    return this.iStr[] + this.aStr; 
  } 