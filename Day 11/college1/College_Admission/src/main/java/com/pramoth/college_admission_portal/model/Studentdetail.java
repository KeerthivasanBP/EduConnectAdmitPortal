package com.pramoth.college_admission_portal.model;

import org.springframework.data.annotation.CreatedDate;

import com.pramoth.college_admission_portal.model.enumerate.Role;
import com.pramoth.college_admission_portal.model.Courses;
import java.util.List;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studentinformations")
public class Studentdetail  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
      private String sdid;
      private String firstName;
      private String lastName;
      private String dateofbirth;
      private String phonenumber;
      private String nationality;
      private String email;
      private String gender;
      private String age;
      private String image;
      private String religion;
      private String state;
      private String caste;
      @Enumerated(EnumType.STRING)
      private Role role;
      @CreatedDate
      @Temporal(TemporalType.TIMESTAMP)
      private Date createdOn;
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "hid", referencedColumnName = "hid")
      private Schoolinformation schoolinformation;
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "cid",referencedColumnName = "cid")
      private Contactdetails contactdetails;
      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "fk_student_id",referencedColumnName = "sdid")
      private List<Courses> courses;
}
