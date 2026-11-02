package com.youcode.formation.config;

import com.youcode.externe.AuditExterne;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AuditExterne.class)

public class ScanExterneConfig {
}
