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
	
	@Column("PAINT_DOT")
	@NonNull
	private Boolean paintdot;
	
	@Column("PAINT_UP_MONOCHROMATIC")
	@NonNull
	private Boolean paintupmonochromatic;
	
	@Column("PAINT_DOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintdownmonochromatic;
	
	@Column("PAINT_LEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintleftmonochromatic;
	
	@Column("PAINT_RIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintrightmonochromatic;
	
	@Column("PAINT_SQUARE_UPLEFTDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquareupleftdownmonochromatic;

	@Column("PAINT_SQUARE_UPRIGHTDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquareuprightdownmonochromatic;

	@Column("PAINT_SQUARE_RIGHTDOWNLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquarerightdownleftmonochromatic;

	@Column("PAINT_SQUARE_RIGHTUPLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquarerightupleftmonochromatic;

	@Column("PAINT_SQUARE_LEFTDOWNRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquareleftdownrightmonochromatic;

	@Column("PAINT_SQUARE_LEFTUPRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquareleftuprightmonochromatic;

	@Column("PAINT_SQUARE_DOWNLEFTUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquaredownleftupmonochromatic;

	@Column("PAINT_SQUARE_DOWNRIGHTUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintsquaredownrightupmonochromatic;

	@Column("PAINT_DIAGONAL_UPLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonalupleftmonochromatic;
	
	@Column("PAINT_DIAGONAL_UPRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaluprightmonochromatic;
	
	@Column("PAINT_DIAGONAL_DOWNLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownleftmonochromatic;
	
	@Column("PAINT_DIAGONAL_DOWNRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownrightmonochromatic;
	
	@Column("PAINT_L_UPLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintlupleftmonochromatic;
	
	@Column("PAINT_L_UPRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintluprightmonochromatic;
	
	@Column("PAINT_L_DOWNLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintldownleftmonochromatic;
	
	@Column("PAINT_L_DOWNRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintldownrightmonochromatic;
	
	@Column("PAINT_L_LEFTUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintlleftupmonochromatic;
	
	@Column("PAINT_L_LEFTDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintlleftdownmonochromatic;
	
	@Column("PAINT_L_RIGHTUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintlrightupmonochromatic;
	
	@Column("PAINT_L_RIGHTDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintlrightdownmonochromatic;
	
	@Column("PAINT_ZIGZAG_LEFTUPDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftupdownmonochromatic;
	
	@Column("PAINT_ZIGZAG_LEFTDOWNUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftdownupmonochromatic;
	
	@Column("PAINT_ZIGZAG_RIGHTUPDOWN_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightupdownmonochromatic;
	
	@Column("PAINT_ZIGZAG_RIGHTDOWNUP_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightdownupmonochromatic;
	
	@Column("PAINT_ZIGZAG_UPLEFTRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagupleftrightmonochromatic;
	
	@Column("PAINT_ZIGZAG_UPRIGHTLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzaguprightleftmonochromatic;
	
	@Column("PAINT_ZIGZAG_DOWNLEFTRIGHT_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownleftrightmonochromatic;
	
	@Column("PAINT_ZIGZAG_DOWNRIGHTLEFT_MONOCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownrightleftmonochromatic;
	
	@Column("PAINT_UP_POLYCHROMATIC")
	@NonNull
	private Boolean paintuppolychromatic;
	
	@Column("PAINT_DOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintdownpolychromatic;
	
	@Column("PAINT_LEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintleftpolychromatic;
	
	@Column("PAINT_RIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintrightpolychromatic;

	@Column("PAINT_SQUARE_UPLEFTDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquareupleftdownpolychromatic;

	@Column("PAINT_SQUARE_UPRIGHTDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquareuprightdownpolychromatic;

	@Column("PAINT_SQUARE_RIGHTDOWNLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquarerightdownleftpolychromatic;

	@Column("PAINT_SQUARE_RIGHTUPLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquarerightupleftpolychromatic;

	@Column("PAINT_SQUARE_LEFTDOWNRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquareleftdownrightpolychromatic;

	@Column("PAINT_SQUARE_LEFTUPRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquareleftuprightpolychromatic;

	@Column("PAINT_SQUARE_DOWNLEFTUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquaredownleftuppolychromatic;

	@Column("PAINT_SQUARE_DOWNRIGHTUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintsquaredownrightuppolychromatic;

	@Column("PAINT_DIAGONAL_UPLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonalupleftpolychromatic;
	
	@Column("PAINT_DIAGONAL_UPRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaluprightpolychromatic;
	
	@Column("PAINT_DIAGONAL_DOWNLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownleftpolychromatic;
	
	@Column("PAINT_DIAGONAL_DOWNRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintdiagonaldownrightpolychromatic;
	
	@Column("PAINT_L_UPLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintlupleftpolychromatic;
	
	@Column("PAINT_L_UPRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintluprightpolychromatic;
	
	@Column("PAINT_L_DOWNLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintldownleftpolychromatic;
	
	@Column("PAINT_L_DOWNRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintldownrightpolychromatic;
	
	@Column("PAINT_L_LEFTUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintlleftuppolychromatic;
	
	@Column("PAINT_L_LEFTDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintlleftdownpolychromatic;
	
	@Column("PAINT_L_RIGHTUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintlrightuppolychromatic;
	
	@Column("PAINT_L_RIGHTDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintlrightdownpolychromatic;
	
	@Column("PAINT_ZIGZAG_LEFTUPDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftupdownpolychromatic;
	
	@Column("PAINT_ZIGZAG_LEFTDOWNUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagleftdownuppolychromatic;
	
	@Column("PAINT_ZIGZAG_RIGHTUPDOWN_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightupdownpolychromatic;
	
	@Column("PAINT_ZIGZAG_RIGHTDOWNUP_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagrightdownuppolychromatic;
	
	@Column("PAINT_ZIGZAG_UPLEFTRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagupleftrightpolychromatic;
	
	@Column("PAINT_ZIGZAG_UPRIGHTLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzaguprightleftpolychromatic;
	
	@Column("PAINT_ZIGZAG_DOWNLEFTRIGHT_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownleftrightpolychromatic;
	
	@Column("PAINT_ZIGZAG_DOWNRIGHTLEFT_POLYCHROMATIC")
	@NonNull
	private Boolean paintzigzagdownrightleftpolychromatic;
	
	@Column("FILL_EMPTY")
	@NonNull
	private Boolean fillempty;
	
	@Column("COPY")
	@NonNull
	private Boolean copy;

	@Column("REPEAT")
	@NonNull
	private Boolean repeat;
	
	@Column("MIRROR_CROSS_VERTICAL")
	@NonNull
	private Boolean mirrorcrossvertical;
	
	@Column("MIRROR_CROSS_HORIZONTAL")
	@NonNull
	private Boolean mirrorcrosshorizontal;

	@Column("MIRROR_CELLS_VERTICAL")
	@NonNull
	private Boolean mirrorcellsvertical;

	@Column("MIRROR_CELLS_HORIZONTAL")
	@NonNull
	private Boolean mirrorcellshorizontal;

	@Column("MIRROR_COMMANDS_VERTICAL")
	@NonNull
	private Boolean mirrorcommandsvertical;

	@Column("MIRROR_COMMANDS_HORIZONTAL")
	@NonNull
	private Boolean mirrorcommandshorizontal;
}
