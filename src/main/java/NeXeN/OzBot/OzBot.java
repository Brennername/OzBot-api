package NeXeN;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@Slf4j

public class OzBot {
    private final UUID id = UUID.randomUUID();
    private String botName;
    private Set<Server> serverSet;
    private Set<String> channelSet;

//    private ServicesIdentification servicesIdentification;



}


