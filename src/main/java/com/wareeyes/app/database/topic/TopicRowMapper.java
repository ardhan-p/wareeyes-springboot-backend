package com.wareeyes.app.database.topic;

import com.wareeyes.app.entity.Topic;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

// maps the SQL data row into a workable Topic object
public class TopicRowMapper implements RowMapper<Topic> {

    @Override
    public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
        Topic topic = new Topic();

        topic.setId(rs.getLong("id"));
        topic.setName(rs.getString("name"));
        topic.setThreshold(rs.getLong("threshold"));
        topic.setPartitions(rs.getLong("partitions"));
        topic.setReplicationFactor(rs.getLong("replicationFactor"));

        return topic;
    }
}
