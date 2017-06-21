package endpoints;

import java.util.List;

import javax.ejb.Remote;

import entities.AgentCenter;

@Remote
public interface NodeEndpointRemote {
	
	void getNodes();

	void setNodes(List<AgentCenter> nodes);
	
	void registerNode(AgentCenter node);

	void unregisterNode(String nodeAddress);

}
