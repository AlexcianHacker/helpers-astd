#ifndef DSTR_SSO 
  #define DSTR_SSO 
#endif 
#include <stdlib.h> 
#include <string.h> 


typedef struct dstr_sso { 
  const char* initstr; 
  // lol 
} dstr_sso; 

dstr_sso dstr_create(const char* istr = NULL, ) { 
  dstr_sso nstr = {istr, }; 
  // lol 
  return nstr; 
} 