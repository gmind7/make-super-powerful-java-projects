environments {
    local {
        profile = 'local'
        artifactory {
            host.url = 'http://localhost/artifactory'
            repokey = 'local-snapshot-local'
            username = 'sample'
            password = 'sample'
        }
    }
    dev {
        profile = 'dev'
        artifactory {
            host.url = 'http://dev/artifactory'
            repokey = 'dev-snapshot-local'
            username = 'sample'
            password = 'sample'
        }
    }
    rc {
        profile = 'rc'
        artifactory {
            host.url = 'http://rc/artifactory'
            repokey = 'rc-snapshot-local'
            username = 'sample'
            password = 'sample'
        }
    }
    live {
        profile = 'live'
        artifactory {
            host.url = 'http://live/artifactory'
            repokey = 'live-release-local'
            username = 'sample'
            password = 'sample'
        }
    }

}