
struct dstr_sso { 
  initstr: &str, heapstr: std::option::Option<String>, // Replace std::string::String With Something Else Later 
} 

fn sso_create(istring: std::option::Option<&str>, initsize: std::option::Option<usize>) -> dstr_sso { 
    
} 

fn sso_append(dstr_obj: dstr_sso, astr: &str) -> std::io::Result<(i8)> { 
  // lol 
  return Ok((0)); 
} 