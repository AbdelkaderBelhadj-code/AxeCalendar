    package com.bbl.dao.entities;
    
    import lombok.*;
    
    import java.io.Serializable;
    import javax.persistence.*;
    
    @Entity
    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Table( name = "Count")
    public class Count implements Serializable{
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idCount")
        private Integer idCount; // Clé primaire
        private int WOW;
        private int TRV;
        private int toValue;
        private int slValue; 
        private int WFH;
        
    }
