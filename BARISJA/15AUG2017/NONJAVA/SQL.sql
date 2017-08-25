--create view 

create view mnl_ops_eqp_events_rvw as select ops.event_id, eqm.eqp_id, ops.eqp_num, eqm.eqp_size_type,  ops.eqp_type,  ops.event_type, ops.curr_loc,ops.next_loc, eqm.eqp_curr_auth_num, eqm.eqp_num_prefix from mnl_ops_eqp_events ops, ITA.mnl_eqm_eqp_master eqm where eqm.eqp_num = ops.eqp_num;
