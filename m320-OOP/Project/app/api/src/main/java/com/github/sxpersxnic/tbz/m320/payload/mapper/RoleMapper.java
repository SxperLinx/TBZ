package com.github.sxpersxnic.tbz.m320.payload.mapper;

import com.github.sxpersxnic.tbz.m320.model.Role;
import com.github.sxpersxnic.tbz.m320.payload.dto.request.RoleRequestDTO;
import com.github.sxpersxnic.tbz.m320.payload.dto.response.RoleResponseDTO;

import java.util.List;


/// Class to map Role objects to RoleResponseDTO objects and vice versa.
/// @see Role
/// @see RoleResponseDTO
/// @author sxpersxnic
public class RoleMapper {
    public static RoleResponseDTO toDTO(Role role) {
        RoleResponseDTO dto = new RoleResponseDTO();

        dto.setId(role.getId().toString());
        dto.setName(role.getName());

        List<String> userIds = role.getAssignedUsers()
                .stream()
                .map(user -> user.getId().toString())
                .toList();
        dto.setAssignedUserIds(userIds);
        return dto;
    }
    public static Role fromDTO(RoleRequestDTO dto) {
        return new Role(dto.getName());
    }
}
