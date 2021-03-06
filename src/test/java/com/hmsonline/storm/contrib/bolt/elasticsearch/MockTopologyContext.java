package com.hmsonline.storm.contrib.bolt.elasticsearch;

import java.util.ArrayList;
import java.util.HashMap;

import backtype.storm.generated.StormTopology;
import backtype.storm.task.TopologyContext;
import backtype.storm.tuple.Fields;

public class MockTopologyContext extends TopologyContext {

    public MockTopologyContext(StormTopology topology) {
        super(topology, new HashMap<String, String>(), new HashMap<Integer, String>(), null, null, null, null, null, -1, -1,
                new ArrayList<Integer>(), null, null, null, null, null);
    }

    public Fields getComponentOutputFields(String componentId, String streamId) {
        return new Fields("index", "type", "id", "document");
    }
}
