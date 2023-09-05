package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Table(name = "itas")
public class ITAS {
	
	@Column("id")
	@Id
	@Generated
	private Long id;
	
	@Column("student_id")
	@NonNull
	private Long studentID;
	
	@Column("e1")
	@NonNull
	private Double e1;
	@Column("e2")
	@NonNull
	private Double e2;
	@Column("e3")
	@NonNull
	private Double e3;
	@Column("e4")
	@NonNull
	private Double e4;
	@Column("e5")
	@NonNull
	private Double e5;
	@Column("e6")
	@NonNull
	private Double e6;
	@Column("e7")
	@NonNull
	private Double e7;
	@Column("e8")
	@NonNull
	private Double e8;
	@Column("e9")
	@NonNull
	private Double e9;
	@Column("e10")
	@NonNull
	private Double e10;
	@Column("e11")
	@NonNull
	private Double e11;
	@Column("e12")
	@NonNull
	private Double e12;
	@Column("e13")
	@NonNull
	private Double e13;
	@Column("e14")
	@NonNull
	private Double e14;
	
	@Column("x11")
	@NonNull
	private Double x11;
	@Column("x12")
	@NonNull
	private Double x12;
	@Column("x13")
	@NonNull
	private Double x13;
	@Column("x14")
	@NonNull
	private Double x14;
	@Column("x21")
	@NonNull
	private Double x21;
	@Column("x22")
	@NonNull
	private Double x22;
	@Column("x23")
	@NonNull
	private Double x23;
	@Column("x24")
	@NonNull
	private Double x24;
	@Column("x31")
	@NonNull
	private Double x31;
	@Column("x32")
	@NonNull
	private Double x32;
	@Column("x33")
	@NonNull
	private Double x33;
	@Column("x34")
	@NonNull
	private Double x34;
	
	public ITAS(Long studentID, double[] results) {
		if(results.length != 26)
			throw new RuntimeException("Results to short");
		this.studentID = studentID;
		
		this.e1 = results[0];
		this.e2 = results[1];
		this.e3 = results[2];
		this.e4 = results[3];
		this.e5 = results[4];
		this.e6 = results[5];
		this.e7 = results[6];
		this.e8 = results[7];
		this.e9 = results[8];
		this.e10 = results[9];
		this.e11 = results[10];
		this.e12 = results[11];
		this.e13 = results[12];
		this.e14 = results[13];
		
		this.x11 = results[14];
		this.x12 = results[15];
		this.x13 = results[16];
		this.x14 = results[17];
		
		this.x21 = results[18];
		this.x22 = results[19];
		this.x23 = results[20];
		this.x24 = results[21];
		
		this.x31 = results[22];
		this.x32 = results[23];
		this.x33 = results[24];
		this.x34 = results[25];
	}
}
