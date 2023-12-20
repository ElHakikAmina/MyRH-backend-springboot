package com.MyRH.MyRHback.service;

import com.MyRH.MyRHback.entity.Agent;
import com.MyRH.MyRHback.repository.AgentRepository;
import com.MyRH.MyRHback.service.ServiceInterface.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentServiceImp implements AgentService {

    private final AgentRepository agentRepository;

    @Autowired
    public AgentServiceImp(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public Agent login(String email, String password) {
        return agentRepository.findByEmailAndPassword(email, password);
    }

    // Implement other methods if needed...
}
