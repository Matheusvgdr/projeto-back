package com.projetos.backapploja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryGenerico<T, ID> extends JpaRepository<T, ID> {
}
