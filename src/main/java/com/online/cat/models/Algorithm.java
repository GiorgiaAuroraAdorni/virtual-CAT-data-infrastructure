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
@Table(name = "algorithms")
public class Algorithm {
	@Column("algorithm")
	@Id
	private Long algorithm;
	
	@Column("SCHEMA")
	@NonNull
	private Long schema;
	
	@Column("COMMANDS")
	@NonNull
	private String commands;
	
	@Column("ALGORITHM_DIMENSION")
	@NonNull
	private Integer algorithmDimension;
	
	@Column("DESCRIPTION")
	@NonNull
	private String description;
	
	@Column("PAINTDOT")
	@NonNull
	private Boolean paintdot;
	
	@Column("PAINTUPMONOCHROMATIC")
	@NonNull
	private Boolean paintupmonochromatic;
	
	@Column("PAINTDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintdownmonochromatic;
	
	@Column("PAINTLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintleftmonochromatic;
	
	@Column("PAINTRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintrightmonochromatic;
	
	@Column("PAINTSQUAREUPLEFTDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintsquareupleftdownmonochromatic;

	@Column("PAINTSQUAREUPRIGHTDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintsquareuprightdownmonochromatic;

	@Column("PAINTSQUARERIGHTDOWNLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintsquarerightdownleftmonochromatic;

	@Column("PAINTSQUARERIGHTUPLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintsquarerightupleftmonochromatic;

	@Column("PAINTSQUARELEFTDOWNRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintsquareleftdownrightmonochromatic;

	@Column("PAINTSQUARELEFTUPRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintsquareleftuprightmonochromatic;

	@Column("PAINTSQUAREDOWNLEFTUPMONOCHROMATIC")
	@NonNull
	private Boolean paintsquaredownleftupmonochromatic;

	@Column("PAINTSQUAREDOWNRIGHTUPMONOCHROMATIC")
	@NonNull
	private Boolean paintsquaredownrightupmonochromatic;

	@Column("PAINTDIAGONALUPLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonalupleftmonochromatic;
	
	@Column("PAINTDIAGONALUPRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaluprightmonochromatic;
	
	@Column("PAINTDIAGONALDOWNLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownleftmonochromatic;
	
	@Column("PAINTDIAGONALDOWNRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownrightmonochromatic;
	
	@Column("PAINTLUPLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintlupleftmonochromatic;
	
	@Column("PAINTLUPRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintluprightmonochromatic;
	
	@Column("PAINTLDOWNLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintldownleftmonochromatic;
	
	@Column("PAINTLDOWNRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintldownrightmonochromatic;
	
	@Column("PAINTLLEFTUPMONOCHROMATIC")
	@NonNull
	private Boolean paintlleftupmonochromatic;
	
	@Column("PAINTLLEFTDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintlleftdownmonochromatic;
	
	@Column("PAINTLRIGHTUPMONOCHROMATIC")
	@NonNull
	private Boolean paintlrightupmonochromatic;
	
	@Column("PAINTLRIGHTDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintlrightdownmonochromatic;
	
	@Column("PAINTZIGZAGLEFTUPDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftupdownmonochromatic;
	
	@Column("PAINTZIGZAGLEFTDOWNUPMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftdownupmonochromatic;
	
	@Column("PAINTZIGZAGRIGHTUPDOWNMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightupdownmonochromatic;
	
	@Column("PAINTZIGZAGRIGHTDOWNUPMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightdownupmonochromatic;
	
	@Column("PAINTZIGZAGUPLEFTRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagupleftrightmonochromatic;
	
	@Column("PAINTZIGZAGUPRIGHTLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzaguprightleftmonochromatic;
	
	@Column("PAINTZIGZAGDOWNLEFTRIGHTMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownleftrightmonochromatic;
	
	@Column("PAINTZIGZAGDOWNRIGHTLEFTMONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownrightleftmonochromatic;
	
	@Column("PAINTUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintuppolychromatic;
	
	@Column("PAINTDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintdownpolychromatic;
	
	@Column("PAINTLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintleftpolychromatic;
	
	@Column("PAINTRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintrightpolychromatic;

	@Column("PAINTSQUAREUPLEFTDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquareupleftdownpolychromatic;

	@Column("PAINTSQUAREUPRIGHTDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquareuprightdownpolychromatic;

	@Column("PAINTSQUARERIGHTDOWNLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquarerightdownleftpolychromatic;

	@Column("PAINTSQUARERIGHTUPLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquarerightupleftpolychromatic;

	@Column("PAINTSQUARELEFTDOWNRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquareleftdownrightpolychromatic;

	@Column("PAINTSQUARELEFTUPRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquareleftuprightpolychromatic;

	@Column("PAINTSQUAREDOWNLEFTUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquaredownleftuppolychromatic;

	@Column("PAINTSQUAREDOWNRIGHTUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintsquaredownrightuppolychromatic;

	@Column("PAINTDIAGONALUPLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonalupleftpolychromatic;
	
	@Column("PAINTDIAGONALUPRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaluprightpolychromatic;
	
	@Column("PAINTDIAGONALDOWNLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownleftpolychromatic;
	
	@Column("PAINTDIAGONALDOWNRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownrightpolychromatic;
	
	@Column("PAINTLUPLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintlupleftpolychromatic;
	
	@Column("PAINTLUPRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintluprightpolychromatic;
	
	@Column("PAINTLDOWNLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintldownleftpolychromatic;
	
	@Column("PAINTLDOWNRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintldownrightpolychromatic;
	
	@Column("PAINTLLEFTUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintlleftuppolychromatic;
	
	@Column("PAINTLLEFTDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintlleftdownpolychromatic;
	
	@Column("PAINTLRIGHTUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintlrightuppolychromatic;
	
	@Column("PAINTLRIGHTDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintlrightdownpolychromatic;
	
	@Column("PAINTZIGZAGLEFTUPDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftupdownpolychromatic;
	
	@Column("PAINTZIGZAGLEFTDOWNUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftdownuppolychromatic;
	
	@Column("PAINTZIGZAGRIGHTUPDOWNPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightupdownpolychromatic;
	
	@Column("PAINTZIGZAGRIGHTDOWNUPPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightdownuppolychromatic;
	
	@Column("PAINTZIGZAGUPLEFTRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagupleftrightpolychromatic;
	
	@Column("PAINTZIGZAGUPRIGHTLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzaguprightleftpolychromatic;
	
	@Column("PAINTZIGZAGDOWNLEFTRIGHTPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownleftrightpolychromatic;
	
	@Column("PAINTZIGZAGDOWNRIGHTLEFTPOLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownrightleftpolychromatic;
	
	@Column("FILLEMPTY")
	@NonNull
	private Boolean fillempty;
	
	@Column("COPY")
	@NonNull
	private Boolean copy;

	@Column("REPEAT")
	@NonNull
	private Boolean repeat;
	
	@Column("MIRRORCROSSVERTICAL")
	@NonNull
	private Boolean mirrorcrossvertical;
	
	@Column("MIRRORCROSSHORIZONTAL")
	@NonNull
	private Boolean mirrorcrosshorizontal;

	@Column("MIRRORCELLSVERTICAL")
	@NonNull
	private Boolean mirrorcellsvertical;

	@Column("MIRRORCELLSHORIZONTAL")
	@NonNull
	private Boolean mirrorcellshorizontal;

	@Column("MIRRORCOMMANDSVERTICAL")
	@NonNull
	private Boolean mirrorcommandsvertical;

	@Column("MIRRORCOMMANDSHORIZONTAL")
	@NonNull
	private Boolean mirrorcommandshorizontal;
}
