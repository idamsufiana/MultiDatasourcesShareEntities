package com.api.multidatasource.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ppsr_product_rollover_ruleset_mapping", schema = "public")
public class PpsrProductRolloverRulesetMapping {
    @Id
    private Long id;
	private String product_id;
	private String ruleset_name;
	private String scenario;
	private String attribute_name;
	private String modified_by;
    @Temporal(TemporalType.TIMESTAMP)
	private Date modified_on;
	private String created_by;
    @Temporal(TemporalType.TIMESTAMP)
	private Date created_on;
	@Column(columnDefinition = "TEXT")
	private String rollover_po;
}