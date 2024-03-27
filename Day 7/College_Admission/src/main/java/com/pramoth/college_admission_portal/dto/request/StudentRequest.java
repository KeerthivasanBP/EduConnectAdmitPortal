package com.pramoth.college_admission_portal.dto.request;
import com.pramoth.college_admission_portal.model.enumerate.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
     private String Sdid;
}
