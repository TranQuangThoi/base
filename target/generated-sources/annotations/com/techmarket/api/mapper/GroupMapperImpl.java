package com.techmarket.api.mapper;

import com.techmarket.api.dto.group.GroupDto;
import com.techmarket.api.model.Group;
import com.techmarket.api.model.Permission;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T00:11:52+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class GroupMapperImpl implements GroupMapper {

    @Override
    public GroupDto fromEntityToGroupDto(Group group) {
        if ( group == null ) {
            return null;
        }

        GroupDto groupDto = new GroupDto();

        groupDto.setName( group.getName() );
        groupDto.setDescription( group.getDescription() );
        groupDto.setId( group.getId() );
        groupDto.setKind( group.getKind() );
        List<Permission> list = group.getPermissions();
        if ( list != null ) {
            groupDto.setPermissions( new ArrayList<Permission>( list ) );
        }

        return groupDto;
    }
}
