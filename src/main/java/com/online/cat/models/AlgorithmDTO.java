package com.online.cat.models;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlgorithmDTO {
	private Long schema;
	private String commands;
	private Integer algorithmDimension;
	private String description;
	private Boolean paintdot;
	private Boolean paintupmonochromatic;
	private Boolean paintdownmonochromatic;
	private Boolean paintleftmonochromatic;
	private Boolean paintrightmonochromatic;
	private Boolean paintsquaremonochromatic;
	private Boolean paintdiagonalupleftmonochromatic;
	private Boolean paintdiagonaluprightmonochromatic;
	private Boolean paintdiagonaldownleftmonochromatic;
	private Boolean paintdiagonaldownrightmonochromatic;
	private Boolean paintlupleftmonochromatic;
	private Boolean paintluprightmonochromatic;
	private Boolean paintldownleftmonochromatic;
	private Boolean paintldownrightmonochromatic;
	private Boolean paintlleftupmonochromatic;
	private Boolean paintlleftdownmonochromatic;
	private Boolean paintlrightupmonochromatic;
	private Boolean paintlrightdownmonochromatic;
	private Boolean paintzigzagleftupdownmonochromatic;
	private Boolean paintzigzagleftdownupmonochromatic;
	private Boolean paintzigzagrightupdownmonochromatic;
	private Boolean paintzigzagrightdownupmonochromatic;
	private Boolean paintzigzagupleftrightmonochromatic;
	private Boolean paintzigzaguprightleftmonochromatic;
	private Boolean paintzigzagdownleftrightmonochromatic;
	private Boolean paintzigzagdownrightleftmonochromatic;
	private Boolean paintuppolychromatic;
	private Boolean paintdownpolychromatic;
	private Boolean paintleftpolychromatic;
	private Boolean paintrightpolychromatic;
	private Boolean paintsquarepolychromatic;
	private Boolean paintdiagonalupleftpolychromatic;
	private Boolean paintdiagonaluprightpolychromatic;
	private Boolean paintdiagonaldownleftpolychromatic;
	private Boolean paintdiagonaldownrightpolychromatic;
	private Boolean paintlupleftpolychromatic;
	private Boolean paintluprightpolychromatic;
	private Boolean paintldownleftpolychromatic;
	private Boolean paintldownrightpolychromatic;
	private Boolean paintlleftuppolychromatic;
	private Boolean paintlleftdownpolychromatic;
	private Boolean paintlrightuppolychromatic;
	private Boolean paintlrightdownpolychromatic;
	private Boolean paintzigzagleftupdownpolychromatic;
	private Boolean paintzigzagleftdownuppolychromatic;
	private Boolean paintzigzagrightupdownpolychromatic;
	private Boolean paintzigzagrightdownuppolychromatic;
	private Boolean paintzigzagupleftrightpolychromatic;
	private Boolean paintzigzaguprightleftpolychromatic;
	private Boolean paintzigzagdownleftrightpolychromatic;
	private Boolean paintzigzagdownrightleftpolychromatic;
	private Boolean fillempty;
	private Boolean copy;
	private Boolean mirrorvertical;
	private Boolean mirrorhorizontal;
	
	public Algorithm toAlgorithm() {
		return Algorithm.of(
//				AlgorithmID.of(this.schema),
				this.schema,
				this.commands,
				this.algorithmDimension,
				this.description,
				this.paintdot,
				this.paintupmonochromatic,
				this.paintdownmonochromatic,
				this.paintleftmonochromatic,
				this.paintrightmonochromatic,
				this.paintsquaremonochromatic,
				this.paintdiagonalupleftmonochromatic,
				this.paintdiagonaluprightmonochromatic,
				this.paintdiagonaldownleftmonochromatic,
				this.paintdiagonaldownrightmonochromatic,
				this.paintlupleftmonochromatic,
				this.paintluprightmonochromatic,
				this.paintldownleftmonochromatic,
				this.paintldownrightmonochromatic,
				this.paintlleftupmonochromatic,
				this.paintlleftdownmonochromatic,
				this.paintlrightupmonochromatic,
				this.paintlrightdownmonochromatic,
				this.paintzigzagleftupdownmonochromatic,
				this.paintzigzagleftdownupmonochromatic,
				this.paintzigzagrightupdownmonochromatic,
				this.paintzigzagrightdownupmonochromatic,
				this.paintzigzagupleftrightmonochromatic,
				this.paintzigzaguprightleftmonochromatic,
				this.paintzigzagdownleftrightmonochromatic,
				this.paintzigzagdownrightleftmonochromatic,
				this.paintuppolychromatic,
				this.paintdownpolychromatic,
				this.paintleftpolychromatic,
				this.paintrightpolychromatic,
				this.paintsquarepolychromatic,
				this.paintdiagonalupleftpolychromatic,
				this.paintdiagonaluprightpolychromatic,
				this.paintdiagonaldownleftpolychromatic,
				this.paintdiagonaldownrightpolychromatic,
				this.paintlupleftpolychromatic,
				this.paintluprightpolychromatic,
				this.paintldownleftpolychromatic,
				this.paintldownrightpolychromatic,
				this.paintlleftuppolychromatic,
				this.paintlleftdownpolychromatic,
				this.paintlrightuppolychromatic,
				this.paintlrightdownpolychromatic,
				this.paintzigzagleftupdownpolychromatic,
				this.paintzigzagleftdownuppolychromatic,
				this.paintzigzagrightupdownpolychromatic,
				this.paintzigzagrightdownuppolychromatic,
				this.paintzigzagupleftrightpolychromatic,
				this.paintzigzaguprightleftpolychromatic,
				this.paintzigzagdownleftrightpolychromatic,
				this.paintzigzagdownrightleftpolychromatic,
				this.fillempty,
				this.copy,
				this.mirrorvertical,
				this.mirrorhorizontal
		);
	}
}
