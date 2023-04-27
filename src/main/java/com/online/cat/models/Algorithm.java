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

	@Column("schema")
	@NonNull
	private Long schema;

	@Column("commands")
	@NonNull
	private String commands;

	@Column("algorithm_dimension")
	@NonNull
	private Integer algorithmDimension;

	@Column("description")
	@NonNull
	private String description;

	@Column("paint_dot")
	@NonNull
	private Boolean paintdot;

	@Column("paint_up_monochromatic")
	@NonNull
	private Boolean paintupmonochromatic;

	@Column("paint_down_monochromatic")
	@NonNull
	private Boolean paintdownmonochromatic;

	@Column("paint_left_monochromatic")
	@NonNull
	private Boolean paintleftmonochromatic;

	@Column("paint_right_monochromatic")
	@NonNull
	private Boolean paintrightmonochromatic;

	@Column("paint_square_upleftdown_monochromatic")
	@NonNull
	private Boolean paintsquareupleftdownmonochromatic;

	@Column("paint_square_uprightdown_monochromatic")
	@NonNull
	private Boolean paintsquareuprightdownmonochromatic;

	@Column("paint_square_rightdownleft_monochromatic")
	@NonNull
	private Boolean paintsquarerightdownleftmonochromatic;

	@Column("paint_square_rightupleft_monochromatic")
	@NonNull
	private Boolean paintsquarerightupleftmonochromatic;

	@Column("paint_square_leftdownright_monochromatic")
	@NonNull
	private Boolean paintsquareleftdownrightmonochromatic;

	@Column("paint_square_leftupright_monochromatic")
	@NonNull
	private Boolean paintsquareleftuprightmonochromatic;

	@Column("paint_square_downleftup_monochromatic")
	@NonNull
	private Boolean paintsquaredownleftupmonochromatic;

	@Column("paint_square_downrightup_monochromatic")
	@NonNull
	private Boolean paintsquaredownrightupmonochromatic;

	@Column("paint_diagonal_upleft_monochromatic")
	@NonNull
	private Boolean paintdiagonalupleftmonochromatic;

	@Column("paint_diagonal_upright_monochromatic")
	@NonNull
	private Boolean paintdiagonaluprightmonochromatic;

	@Column("paint_diagonal_downleft_monochromatic")
	@NonNull
	private Boolean paintdiagonaldownleftmonochromatic;

	@Column("paint_diagonal_downright_monochromatic")
	@NonNull
	private Boolean paintdiagonaldownrightmonochromatic;

	@Column("paint_l_upleft_monochromatic")
	@NonNull
	private Boolean paintlupleftmonochromatic;

	@Column("paint_l_upright_monochromatic")
	@NonNull
	private Boolean paintluprightmonochromatic;

	@Column("paint_l_downleft_monochromatic")
	@NonNull
	private Boolean paintldownleftmonochromatic;

	@Column("paint_l_downright_monochromatic")
	@NonNull
	private Boolean paintldownrightmonochromatic;

	@Column("paint_l_leftup_monochromatic")
	@NonNull
	private Boolean paintlleftupmonochromatic;

	@Column("paint_l_leftdown_monochromatic")
	@NonNull
	private Boolean paintlleftdownmonochromatic;

	@Column("paint_l_rightup_monochromatic")
	@NonNull
	private Boolean paintlrightupmonochromatic;

	@Column("paint_l_rightdown_monochromatic")
	@NonNull
	private Boolean paintlrightdownmonochromatic;

	@Column("paint_zigzag_leftupdown_monochromatic")
	@NonNull
	private Boolean paintzigzagleftupdownmonochromatic;

	@Column("paint_zigzag_leftdownup_monochromatic")
	@NonNull
	private Boolean paintzigzagleftdownupmonochromatic;

	@Column("paint_zigzag_rightupdown_monochromatic")
	@NonNull
	private Boolean paintzigzagrightupdownmonochromatic;

	@Column("paint_zigzag_rightdownup_monochromatic")
	@NonNull
	private Boolean paintzigzagrightdownupmonochromatic;

	@Column("paint_zigzag_upleftright_monochromatic")
	@NonNull
	private Boolean paintzigzagupleftrightmonochromatic;

	@Column("paint_zigzag_uprightleft_monochromatic")
	@NonNull
	private Boolean paintzigzaguprightleftmonochromatic;

	@Column("paint_zigzag_downleftright_monochromatic")
	@NonNull
	private Boolean paintzigzagdownleftrightmonochromatic;

	@Column("paint_zigzag_downrightleft_monochromatic")
	@NonNull
	private Boolean paintzigzagdownrightleftmonochromatic;

	@Column("paint_up_polychromatic")
	@NonNull
	private Boolean paintuppolychromatic;

	@Column("paint_down_polychromatic")
	@NonNull
	private Boolean paintdownpolychromatic;

	@Column("paint_left_polychromatic")
	@NonNull
	private Boolean paintleftpolychromatic;

	@Column("paint_right_polychromatic")
	@NonNull
	private Boolean paintrightpolychromatic;

	@Column("paint_square_upleftdown_polychromatic")
	@NonNull
	private Boolean paintsquareupleftdownpolychromatic;

	@Column("paint_square_uprightdown_polychromatic")
	@NonNull
	private Boolean paintsquareuprightdownpolychromatic;

	@Column("paint_square_rightdownleft_polychromatic")
	@NonNull
	private Boolean paintsquarerightdownleftpolychromatic;

	@Column("paint_square_rightupleft_polychromatic")
	@NonNull
	private Boolean paintsquarerightupleftpolychromatic;

	@Column("paint_square_leftdownright_polychromatic")
	@NonNull
	private Boolean paintsquareleftdownrightpolychromatic;

	@Column("paint_square_leftupright_polychromatic")
	@NonNull
	private Boolean paintsquareleftuprightpolychromatic;

	@Column("paint_square_downleftup_polychromatic")
	@NonNull
	private Boolean paintsquaredownleftuppolychromatic;

	@Column("paint_square_downrightup_polychromatic")
	@NonNull
	private Boolean paintsquaredownrightuppolychromatic;

	@Column("paint_diagonal_upleft_polychromatic")
	@NonNull
	private Boolean paintdiagonalupleftpolychromatic;

	@Column("paint_diagonal_upright_polychromatic")
	@NonNull
	private Boolean paintdiagonaluprightpolychromatic;

	@Column("paint_diagonal_downleft_polychromatic")
	@NonNull
	private Boolean paintdiagonaldownleftpolychromatic;

	@Column("paint_diagonal_downright_polychromatic")
	@NonNull
	private Boolean paintdiagonaldownrightpolychromatic;

	@Column("paint_l_upleft_polychromatic")
	@NonNull
	private Boolean paintlupleftpolychromatic;

	@Column("paint_l_upright_polychromatic")
	@NonNull
	private Boolean paintluprightpolychromatic;

	@Column("paint_l_downleft_polychromatic")
	@NonNull
	private Boolean paintldownleftpolychromatic;

	@Column("paint_l_downright_polychromatic")
	@NonNull
	private Boolean paintldownrightpolychromatic;

	@Column("paint_l_leftup_polychromatic")
	@NonNull
	private Boolean paintlleftuppolychromatic;

	@Column("paint_l_leftdown_polychromatic")
	@NonNull
	private Boolean paintlleftdownpolychromatic;

	@Column("paint_l_rightup_polychromatic")
	@NonNull
	private Boolean paintlrightuppolychromatic;

	@Column("paint_l_rightdown_polychromatic")
	@NonNull
	private Boolean paintlrightdownpolychromatic;

	@Column("paint_zigzag_leftupdown_polychromatic")
	@NonNull
	private Boolean paintzigzagleftupdownpolychromatic;

	@Column("paint_zigzag_leftdownup_polychromatic")
	@NonNull
	private Boolean paintzigzagleftdownuppolychromatic;

	@Column("paint_zigzag_rightupdown_polychromatic")
	@NonNull
	private Boolean paintzigzagrightupdownpolychromatic;

	@Column("paint_zigzag_rightdownup_polychromatic")
	@NonNull
	private Boolean paintzigzagrightdownuppolychromatic;

	@Column("paint_zigzag_upleftright_polychromatic")
	@NonNull
	private Boolean paintzigzagupleftrightpolychromatic;

	@Column("paint_zigzag_uprightleft_polychromatic")
	@NonNull
	private Boolean paintzigzaguprightleftpolychromatic;

	@Column("paint_zigzag_downleftright_polychromatic")
	@NonNull
	private Boolean paintzigzagdownleftrightpolychromatic;

	@Column("paint_zigzag_downrightleft_polychromatic")
	@NonNull
	private Boolean paintzigzagdownrightleftpolychromatic;

	@Column("fill_empty")
	@NonNull
	private Boolean fillempty;

	@Column("copy")
	@NonNull
	private Boolean copy;

	@Column("repeat")
	@NonNull
	private Boolean repeat;

	@Column("mirror_cross_vertical")
	@NonNull
	private Boolean mirrorcrossvertical;

	@Column("mirror_cross_horizontal")
	@NonNull
	private Boolean mirrorcrosshorizontal;

	@Column("mirror_cells_vertical")
	@NonNull
	private Boolean mirrorcellsvertical;

	@Column("mirror_cells_horizontal")
	@NonNull
	private Boolean mirrorcellshorizontal;

	@Column("mirror_commands_vertical")
	@NonNull
	private Boolean mirrorcommandsvertical;

	@Column("mirror_commands_horizontal")
	@NonNull
	private Boolean mirrorcommandshorizontal;
}
