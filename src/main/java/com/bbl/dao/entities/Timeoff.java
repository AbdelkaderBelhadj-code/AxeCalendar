package com.bbl.dao.entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Timeoff implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String detail;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startingdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endingdate;
    private String note;
    
}
