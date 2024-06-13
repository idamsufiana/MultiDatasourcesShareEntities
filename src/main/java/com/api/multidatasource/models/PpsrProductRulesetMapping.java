package com.api.multidatasource.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ppsr_product_ruleset_mapping", schema = "public")
public class PpsrProductRulesetMapping {
    @Id
    private Long id;
	private String product_id;
	private String ruleset_name;
	private String product_name;
	@Column(columnDefinition = "TEXT")
	private String claim_command;
	private String simcard_validity_variant;
	private String lifetime_validity;
	private String max_lifetime;
	private String created_by;
    @Temporal(TemporalType.TIMESTAMP)
	private Date created_on;
    @Temporal(TemporalType.TIMESTAMP)
	private Date modified_on;
	private String modified_by;
	private String request_unit_type;
	private String conversion_factor;
}
