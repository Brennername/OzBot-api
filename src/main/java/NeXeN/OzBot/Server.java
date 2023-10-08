package NeXeN;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder

public class Server {
 private final String serverName;
 private final Set<Integer> ports;
 private final boolean nickserv;


}
