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
	@Column(value ="algorithm")
	@Id
	private Long algorithm;

	@Column(value ="schema")
	@NonNull
	private Long schema;

	@Column(value ="commands")
	@NonNull
	private String commands;

	@Column(value ="algorithm_dimension")
	@NonNull
	private Integer algorithmDimension;

	@Column(value ="description")
	@NonNull
	private String description;

	@Column(value ="paint_dot")
	@NonNull
	private Boolean paintdot;

	@Column(value ="paint_up_monochromatic")
	@NonNull
	private Boolean paintupmonochromatic;

	@Column(value ="paint_down_monochromatic")
	@NonNull
	private Boolean paintdownmonochromatic;

	@Column(value ="paint_left_monochromatic")
	@NonNull
	private Boolean paintleftmonochromatic;

	@Column(value ="paint_right_monochromatic")
	@NonNull
	private Boolean paintrightmonochromatic;

	@Column(value ="paint_square_upleftdown_monochromatic")
	@NonNull
	private Boolean paintsquareupleftdownmonochromatic;

	@Column(value ="paint_square_uprightdown_monochromatic")
	@NonNull
	private Boolean paintsquareuprightdownmonochromatic;

	@Column(value ="paint_square_rightdownleft_monochromatic")
	@NonNull
	private Boolean paintsquarerightdownleftmonochromatic;

	@Column(value ="paint_square_rightupleft_monochromatic")
	@NonNull
	private Boolean paintsquarerightupleftmonochromatic;

	@Column(value ="paint_square_leftdownright_monochromatic")
	@NonNull
	private Boolean paintsquareleftdownrightmonochromatic;

	@Column(value ="paint_square_leftupright_monochromatic")
	@NonNull
	private Boolean paintsquareleftuprightmonochromatic;

	@Column(value ="paint_square_downleftup_monochromatic")
	@NonNull
	private Boolean paintsquaredownleftupmonochromatic;

	@Column(value ="paint_square_downrightup_monochromatic")
	@NonNull
	private Boolean paintsquaredownrightupmonochromatic;

	@Column(value ="paint_diagonal_upleft_monochromatic")
	@NonNull
	private Boolean paintdiagonalupleftmonochromatic;

	@Column(value ="paint_diagonal_upright_monochromatic")
	@NonNull
	private Boolean paintdiagonaluprightmonochromatic;

	@Column(value ="paint_diagonal_downleft_monochromatic")
	@NonNull
	private Boolean paintdiagonaldownleftmonochromatic;

	@Column(value ="paint_diagonal_downright_monochromatic")
	@NonNull
	private Boolean paintdiagonaldownrightmonochromatic;

	@Column(value ="paint_l_upleft_monochromatic")
	@NonNull
	private Boolean paintlupleftmonochromatic;

	@Column(value ="paint_l_upright_monochromatic")
	@NonNull
	private Boolean paintluprightmonochromatic;

	@Column(value ="paint_l_downleft_monochromatic")
	@NonNull
	private Boolean paintldownleftmonochromatic;

	@Column(value ="paint_l_downright_monochromatic")
	@NonNull
	private Boolean paintldownrightmonochromatic;

	@Column(value ="paint_l_leftup_monochromatic")
	@NonNull
	private Boolean paintlleftupmonochromatic;

	@Column(value ="paint_l_leftdown_monochromatic")
	@NonNull
	private Boolean paintlleftdownmonochromatic;

	@Column(value ="paint_l_rightup_monochromatic")
	@NonNull
	private Boolean paintlrightupmonochromatic;

	@Column(value ="paint_l_rightdown_monochromatic")
	@NonNull
	private Boolean paintlrightdownmonochromatic;

	@Column(value ="paint_zigzag_leftupdown_monochromatic")
	@NonNull
	private Boolean paintzigzagleftupdownmonochromatic;

	@Column(value ="paint_zigzag_leftdownup_monochromatic")
	@NonNull
	private Boolean paintzigzagleftdownupmonochromatic;

	@Column(value ="paint_zigzag_rightupdown_monochromatic")
	@NonNull
	private Boolean paintzigzagrightupdownmonochromatic;

	@Column(value ="paint_zigzag_rightdownup_monochromatic")
	@NonNull
	private Boolean paintzigzagrightdownupmonochromatic;

	@Column(value ="paint_zigzag_upleftright_monochromatic")
	@NonNull
	private Boolean paintzigzagupleftrightmonochromatic;

	@Column(value ="paint_zigzag_uprightleft_monochromatic")
	@NonNull
	private Boolean paintzigzaguprightleftmonochromatic;

	@Column(value ="paint_zigzag_downleftright_monochromatic")
	@NonNull
	private Boolean paintzigzagdownleftrightmonochromatic;

	@Column(value ="paint_zigzag_downrightleft_monochromatic")
	@NonNull
	private Boolean paintzigzagdownrightleftmonochromatic;

	@Column(value ="paint_up_polychromatic")
	@NonNull
	private Boolean paintuppolychromatic;

	@Column(value ="paint_down_polychromatic")
	@NonNull
	private Boolean paintdownpolychromatic;

	@Column(value ="paint_left_polychromatic")
	@NonNull
	private Boolean paintleftpolychromatic;

	@Column(value ="paint_right_polychromatic")
	@NonNull
	private Boolean paintrightpolychromatic;

	@Column(value ="paint_square_upleftdown_polychromatic")
	@NonNull
	private Boolean paintsquareupleftdownpolychromatic;

	@Column(value ="paint_square_uprightdown_polychromatic")
	@NonNull
	private Boolean paintsquareuprightdownpolychromatic;

	@Column(value ="paint_square_rightdownleft_polychromatic")
	@NonNull
	private Boolean paintsquarerightdownleftpolychromatic;

	@Column(value ="paint_square_rightupleft_polychromatic")
	@NonNull
	private Boolean paintsquarerightupleftpolychromatic;

	@Column(value ="paint_square_leftdownright_polychromatic")
	@NonNull
	private Boolean paintsquareleftdownrightpolychromatic;

	@Column(value ="paint_square_leftupright_polychromatic")
	@NonNull
	private Boolean paintsquareleftuprightpolychromatic;

	@Column(value ="paint_square_downleftup_polychromatic")
	@NonNull
	private Boolean paintsquaredownleftuppolychromatic;

	@Column(value ="paint_square_downrightup_polychromatic")
	@NonNull
	private Boolean paintsquaredownrightuppolychromatic;

	@Column(value ="paint_diagonal_upleft_polychromatic")
	@NonNull
	private Boolean paintdiagonalupleftpolychromatic;

	@Column(value ="paint_diagonal_upright_polychromatic")
	@NonNull
	private Boolean paintdiagonaluprightpolychromatic;

	@Column(value ="paint_diagonal_downleft_polychromatic")
	@NonNull
	private Boolean paintdiagonaldownleftpolychromatic;

	@Column(value ="paint_diagonal_downright_polychromatic")
	@NonNull
	private Boolean paintdiagonaldownrightpolychromatic;

	@Column(value ="paint_l_upleft_polychromatic")
	@NonNull
	private Boolean paintlupleftpolychromatic;

	@Column(value ="paint_l_upright_polychromatic")
	@NonNull
	private Boolean paintluprightpolychromatic;

	@Column(value ="paint_l_downleft_polychromatic")
	@NonNull
	private Boolean paintldownleftpolychromatic;

	@Column(value ="paint_l_downright_polychromatic")
	@NonNull
	private Boolean paintldownrightpolychromatic;

	@Column(value ="paint_l_leftup_polychromatic")
	@NonNull
	private Boolean paintlleftuppolychromatic;

	@Column(value ="paint_l_leftdown_polychromatic")
	@NonNull
	private Boolean paintlleftdownpolychromatic;

	@Column(value ="paint_l_rightup_polychromatic")
	@NonNull
	private Boolean paintlrightuppolychromatic;

	@Column(value ="paint_l_rightdown_polychromatic")
	@NonNull
	private Boolean paintlrightdownpolychromatic;

	@Column(value ="paint_zigzag_leftupdown_polychromatic")
	@NonNull
	private Boolean paintzigzagleftupdownpolychromatic;

	@Column(value ="paint_zigzag_leftdownup_polychromatic")
	@NonNull
	private Boolean paintzigzagleftdownuppolychromatic;

	@Column(value ="paint_zigzag_rightupdown_polychromatic")
	@NonNull
	private Boolean paintzigzagrightupdownpolychromatic;

	@Column(value ="paint_zigzag_rightdownup_polychromatic")
	@NonNull
	private Boolean paintzigzagrightdownuppolychromatic;

	@Column(value ="paint_zigzag_upleftright_polychromatic")
	@NonNull
	private Boolean paintzigzagupleftrightpolychromatic;

	@Column(value ="paint_zigzag_uprightleft_polychromatic")
	@NonNull
	private Boolean paintzigzaguprightleftpolychromatic;

	@Column(value ="paint_zigzag_downleftright_polychromatic")
	@NonNull
	private Boolean paintzigzagdownleftrightpolychromatic;

	@Column(value ="paint_zigzag_downrightleft_polychromatic")
	@NonNull
	private Boolean paintzigzagdownrightleftpolychromatic;

	@Column(value ="fill_empty")
	@NonNull
	private Boolean fillempty;

	@Column(value ="copy")
	@NonNull
	private Boolean copy;

	@Column(value ="repeat")
	@NonNull
	private Boolean repeat;

	@Column(value ="mirror_cross_vertical")
	@NonNull
	private Boolean mirrorcrossvertical;

	@Column(value ="mirror_cross_horizontal")
	@NonNull
	private Boolean mirrorcrosshorizontal;

	@Column(value ="mirror_cells_vertical")
	@NonNull
	private Boolean mirrorcellsvertical;

	@Column(value ="mirror_cells_horizontal")
	@NonNull
	private Boolean mirrorcellshorizontal;

	@Column(value ="mirror_commands_vertical")
	@NonNull
	private Boolean mirrorcommandsvertical;

	@Column(value ="mirror_commands_horizontal")
	@NonNull
	private Boolean mirrorcommandshorizontal;
}
