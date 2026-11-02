package com.youcode.externe;

import org.springframework.stereotype.Component;

@Component
public class AuditExterne {

  public String info() {
    return "AuditExterne : bean du package com.youcode.externe détecté.";
  }
}
