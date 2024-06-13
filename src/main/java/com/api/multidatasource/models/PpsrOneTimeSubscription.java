package com.api.multidatasource.models;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="ppsr_one_time_subscription", schema = "public")
public class PpsrOneTimeSubscription {

    @Id
    private Long ppsr_subscription_id;
	private Long msisdn;
	private String subscriber_type;
	private String product_id;
	private String ruleset_name;
    @Temporal(TemporalType.TIMESTAMP)
	private Date activation_date;
    @Temporal(TemporalType.TIMESTAMP)
	private Date deactivation_date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiry_date;
	private String service_registry_id;
	private String subscription_status;
	private Long subscription_fee;
	private String reason;
	private String request_type;
	private String transaction_id;
	private String source;
	private Long bill_cycle_id;
	private String order_id;
	private String channel;
	private String master_rule_id;
	private String package_mc_id;
	private String package_wttx;
	private String package_zone_cat;
	private String package_zone_id;
	private String package_zone_name;
	private String sid;
	private Boolean is_claim;
	private Boolean is_mpp;
	private String package_dormant_type;
	private Boolean is_loan_applied;
	private String keyword;
	private String dealer_id;
	private Boolean is_opt_in_flag;
    @Temporal(TemporalType.TIMESTAMP)
	private Date opt_in_confirmation_date;
	@Column(columnDefinition = "TEXT")
	private String child_info;
	private String epc_group_id;
	@Column(columnDefinition = "TEXT")
	private String offer;
	private String da;
	private String ua;
	private String ut;
    @Temporal(TemporalType.TIMESTAMP)
	private Date created_on;
    @Temporal(TemporalType.TIMESTAMP)
	private Date modified_on;
	private String created_by;
	private String modified_by;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String opt5;
	@Column(columnDefinition = "TEXT")
	private String mandatory_child_info;
	@Column(columnDefinition = "TEXT")
	private String optional_child_info;
	private Long donor_msisdn;
	private Boolean simulator;
	private String row_id;
	private String sim_id;
	private String short_code;
	private String bundling_type;
	private String external_id;
	private String old_transaction_id;
	private String uc;
	private String cvm_quota_details;
	@Column(columnDefinition = "TEXT")
	private String standalone_resources;
	@Column(columnDefinition = "TEXT")
	private String testing_channel;
}
