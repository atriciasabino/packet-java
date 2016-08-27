/**
 * Copyright (c) The packet-java Authors, All rights reserved.
 * 
 * packet-java source code and usage is governed by a MIT style license that can be found in the
 * LICENSE file
 */

package net.packet;

import net.packet.exception.PacketException;
import net.packet.pojo.Device;
import net.packet.pojo.Devices;
import net.packet.pojo.Facilities;
import net.packet.pojo.IpAddress;
import net.packet.pojo.IpAddresses;
import net.packet.pojo.OperatingSystems;
import net.packet.pojo.Plans;
import net.packet.pojo.Project;
import net.packet.pojo.Projects;
import net.packet.pojo.ReserveIpAddress;

/**
 * Packet API client interface of REST APIs.
 * 
 * @author Jeevanandam M. (https://github.com/jeevatkm)
 * @since v1.0.0
 */
public interface Packet {

  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // Facility methods
  // ___________________________________

  Facilities getFacilites(Integer pageNo, Integer perPage) throws PacketException;

  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // Operating systems methods
  // ___________________________________

  OperatingSystems getOperatingSystems(Integer pageNo, Integer perPage) throws PacketException;

  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // Plans methods
  // ___________________________________

  Plans getPlans(Integer pageNo, Integer perPage) throws PacketException;

  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // Projects methods
  // ___________________________________

  Projects getProjects(Integer pageNo, Integer perPage) throws PacketException;

  Project getProject(String projectId) throws PacketException;

  Project createProject(Project project) throws PacketException;

  Project updateProject(Project project) throws PacketException;

  Boolean deleteProject(String projectId) throws PacketException;

  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // Devices methods
  // ___________________________________

  Devices getDevices(String projectId, Integer pageNo, Integer perPage) throws PacketException;

  Device getDevice(String deviceId) throws PacketException;

  Device createDevice(String projectId, Device device) throws PacketException;

  Device updateDevice(Device device) throws PacketException;

  Boolean deleteDevice(String deviceId) throws PacketException;
  
  Boolean powerOnDevice(String deviceId) throws PacketException;
  
  Boolean powerOffDevice(String deviceId) throws PacketException;
  
  Boolean rebootDevice(String deviceId) throws PacketException;
  
  Boolean rescueDevice(String deviceId) throws PacketException;
  
  // ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  // IP Address methods
  // ___________________________________
  
  IpAddresses getIpAddresses(String projectId) throws PacketException;
  
  Boolean reserveIpAddress(String projectId, ReserveIpAddress reserveIpAddress) throws PacketException;

  IpAddress getIpAddress(String ipAddressId) throws PacketException;

  Boolean deleteIpAddress(String ipAddressId) throws PacketException;

}
