package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.Identification;
import java.util.List;

public interface IdentificationService {
    Identification getIdentificationByUserName(String user_name);
    List<Identification> getAllIdentifications();
}